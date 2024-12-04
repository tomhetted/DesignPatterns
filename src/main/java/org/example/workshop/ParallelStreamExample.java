package org.example.workshop;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int sum = IntStream.range(1, 1000000)
                .sum();

        long end = System.currentTimeMillis();
        System.out.println("Сумма: " + sum + ", Время: " + (end - start) + " мс");

        long parallelStart = System.currentTimeMillis();

        int parallelSum = IntStream.range(1, 1000000)
                .parallel()
                .sum();

        long parallelEnd = System.currentTimeMillis();
        System.out.println("Сумма: " + parallelSum + ", Время: " + (parallelEnd - parallelStart) + " мс");
    }
}

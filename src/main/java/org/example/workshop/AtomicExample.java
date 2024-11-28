package org.example.workshop;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicExample {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // Атомарное увеличение на 1
    }

    public int getCount() {
        return count.get(); // Получение текущего значения
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicExample example = new AtomicExample();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) example.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) example.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Итоговое значение: " + example.getCount());
    }
}


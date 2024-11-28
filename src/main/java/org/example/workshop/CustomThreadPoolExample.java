package org.example.workshop;

import java.util.concurrent.*;

public class CustomThreadPoolExample {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,                                  // corePoolSize: минимальное количество потоков
                4,                                              // maximumPoolSize: максимальное количество потоков
                60,                                             // время ожидания для неактивных потоков
                TimeUnit.SECONDS,                               // единицы времени ожидания
                new LinkedBlockingQueue<>(2),           // очередь задач
                new ThreadPoolExecutor.CallerRunsPolicy()       // обработка задач при переполнении
        );

        for (int i = 1; i <= 10; i++) {
            final int taskNumber = i;
            executor.execute(() -> {
                System.out.println("Выполняется задача " + taskNumber + " в " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // Симуляция работы
                    System.out.println("Задача " + taskNumber + " в " + Thread.currentThread().getName() + " выполнена");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
    }
}


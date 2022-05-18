package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        try {
            for (int i = 0; i < 5; i++) {
                executorService.execute(() -> print(Thread.currentThread().getName()));
            }
        } finally {
            executorService.shutdownNow();
        }
    }

    private static void print(String threadName) {
        System.out.println("Running inside thread: " + threadName);
    }
}

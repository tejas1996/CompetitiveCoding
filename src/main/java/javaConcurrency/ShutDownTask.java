package javaConcurrency;

import java.util.concurrent.*;

public class ShutDownTask {

    public static void main(String[] args) {


        TenSecTask task = new TenSecTask();
        Runnable runnable = task;

//        task.keepRunning = false;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(runnable);

        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
        executorService.shutdownNow();

    }

    private static void dothis() throws Exception {

        for (int i = 0; i < 100000; i++) {
            if (!Thread.currentThread().isInterrupted()) {
                System.out.println("doing");
            } else {
                throw new Exception("not done in this");
            }
        }
    }
}

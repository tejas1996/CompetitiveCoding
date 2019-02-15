package javaConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AwaitSignalCondition {

    static Lock lock = new ReentrantLock(true);

    static Condition isFull = lock.newCondition();
    static Condition isEmpty = lock.newCondition();
    static int count = 0;

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(10);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    int ans = myQueue.get();
                    System.out.println("got this " + ans);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                try {

                    int ans = myQueue.get();
                    System.out.println("got this " + ans);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(5000);
                    System.out.println("putting this item 3");
                    myQueue.put(3);
                    myQueue.put(5);
                    myQueue.put(6);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(runnable);
        for (int i = 0; i < 10; i++) {
            int y = 1 + 1;
        }
        executorService.submit(runnable1);
        executorService.submit(runnable3);


    }

}

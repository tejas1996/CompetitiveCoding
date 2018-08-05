package javaConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadVsPool {

    public static void main(String[] args) {


// There are two codes below : In the above one we form a new thread for every task; and in the second peice of code we use a executor service
// comment and uncomment one code at a time


//        long start = System.currentTimeMillis();
//        System.out.println("Start is :"+start);
//        for (int i = 0; i < 1000; i++) {
//            Thread t1 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//
//                    try {
//                        System.out.println(System.currentTimeMillis()-start);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            });
//            t1.start();
//
//        }


        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(16);
        System.out.println("Start is :" + start);
        for (int i = 0; i < 1000; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(System.currentTimeMillis() - start);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            };
            executorService.submit(runnable);

        }
        executorService.shutdown();


//        long start = System.currentTimeMillis();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        System.out.println("Start is :"+start);
//        for (int i = 0; i < 1000; i++) {
//            Runnable runnable = new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        System.out.println(System.currentTimeMillis() - start);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            };
//            executorService.submit(runnable);
//
//        }
//        executorService.shutdown();


    }


}

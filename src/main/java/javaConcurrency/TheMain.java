package javaConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheMain {
    public static void main(String[] args) {

        Child child = new Child();
        Child2 child2 = new Child2();

        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(child);
        es.submit(child2);

        for (int i = 0; i < 10; i++) {
            System.out.println("printing in main");
        }

    }
}

import com.sun.org.apache.xpath.internal.operations.String;

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Puzzle {


    static int HTTPCounter = 0;
    static int HTTPSCounter = 0;
    public Object httpLock = new String();
    public Object httpslock = new String();

    public static void main(String[] args) throws InterruptedException {

        final Puzzle puzzle = new Puzzle();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("HTTP request");

                        puzzle.increamentHTTPCounter();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("HTTPS request");
                        puzzle.increamentHTTPSCounter();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        t2.start();


    }

    public synchronized void increamentHTTPCounter() throws InterruptedException {
        Thread.sleep(1000);
        HTTPCounter++;

    }

    public synchronized void increamentHTTPSCounter() throws InterruptedException {

        Thread.sleep(1000);
        HTTPSCounter++;
    }


}
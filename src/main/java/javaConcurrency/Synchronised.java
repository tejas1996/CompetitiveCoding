package javaConcurrency;

public class Synchronised {


    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        //how to use synchronised

        final Synchronised synchronisedObject = new Synchronised();

        for (int i = 0; i < 1000; i++) {

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        synchronisedObject.incriment();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
            t1.start();


        }

        // the purpose fo this code is to inderstand how synchronised woprks and how every thread waits for all the other threads


        Thread.sleep(1000);
        System.out.println(counter);
    }

    private void incriment() throws InterruptedException {


        synchronized (this) {

//            System.out.println("this is " + Thread.currentThread());
            //  Thread.sleep(1000);
            counter++;


        }

    }


}

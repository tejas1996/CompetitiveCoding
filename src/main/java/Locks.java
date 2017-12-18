import java.util.concurrent.locks.ReentrantLock;

public class Locks {

    private static int counter = 0;

    private ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        final Locks locks = new Locks();

        //  for (int i = 0; i < 100; i++) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    locks.incriment();
                    locks.incriment();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();

        //}

        System.out.println("entered");
        Thread.sleep(10000);
        System.out.println("ending");

        // so in this code we see that in synchronised that the same cannot enter the lock again whixh we might mot want
        // in case of reenterent locks the same thread is given the acces of the lock and so it can enter the lock again


    }


    private void incriment() throws InterruptedException {


        reentrantLock.lock();

        counter++;
        Thread.sleep(100);
        System.out.println("this is " + Thread.currentThread());


        reentrantLock.unlock();

    }


}

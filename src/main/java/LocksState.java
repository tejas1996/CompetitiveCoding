import java.util.concurrent.locks.ReentrantLock;

public class LocksState {


    private static int counter = 0;
    private ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        final LocksState synchronisedState = new LocksState();


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    synchronisedState.incriment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        thread.start();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    synchronisedState.incriment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();


        while (true) {
            Thread.sleep(1000);
            System.out.println("state of thread is " + thread.getState());
            System.out.println("state of t1 is " + t1.getState());

        }

        // the purpose fo this code is to inderstand how synchronised woprks and how every thread waits for all the other threads


    }

    private void incriment() throws InterruptedException {


        reentrantLock.lock();
        System.out.println("this is " + Thread.currentThread());
        Thread.sleep(10000);
        counter++;
        reentrantLock.unlock();


    }


}

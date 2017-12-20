import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariables {

    private static AtomicInteger counter = new AtomicInteger(0);
    private static int counter2 = 0;

    public static void main(String[] args) throws InterruptedException {

        final AtomicVariables atomicVariables = new AtomicVariables();

        for (int i = 0; i < 1000; i++) {

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        atomicVariables.incriment();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
            t1.start();

        }

        Thread.sleep(3000);
        System.out.println("the count of int variable is -- " + counter2);
        System.out.println("the count of Atomic integer is -- " + counter);
    }

    private void incriment() throws InterruptedException {


//            System.out.println("this is " + Thread.currentThread());
        Thread.sleep(200);
        counter.getAndIncrement();
        counter2++;


    }
}
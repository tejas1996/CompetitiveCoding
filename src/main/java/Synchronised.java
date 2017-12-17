public class Synchronised {


    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        //how to use synchronised

        final Synchronised synchronisedObject = new Synchronised();

        for (int i = 0; i < 100; i++) {

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

        Thread.sleep(1000);
        System.out.println(counter);
    }

    private void incriment() throws InterruptedException {


        synchronized (this) {

            counter++;
            System.out.println("this is " + Thread.currentThread());


        }

    }


}

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWrite {

    private static String apple = "apple";
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) throws InterruptedException {

        final ReadWrite readWrite = new ReadWrite();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println("lock got");
                    readWrite.change();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();

        Thread.sleep(1000);

        for (int i = 0; i < 10; i++) {


            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        readWrite.read();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
            t2.start();

        }
        System.out.println("waiting");


    }

    private void change() throws InterruptedException {

        readWriteLock.writeLock().lock();
        apple = apple + "A";
        Thread.sleep(5000);
        //readWriteLock.notifyAll();
        apple = apple + "E";
        System.out.println("gettingout");
        readWriteLock.writeLock().unlock();


    }

    private void read() throws InterruptedException {

        readWriteLock.readLock().lock();
        //    Thread.sleep(1000);
        System.out.println(apple);
        readWriteLock.readLock().unlock();


    }

}


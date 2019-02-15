package javaConcurrency;

public class TenSecTask implements Runnable {
    public volatile boolean keepRunning = true;

    @Override
    public void run() {
        while (keepRunning) {
            System.out.println("keep doing");
        }


    }
}

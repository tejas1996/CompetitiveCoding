package javaConcurrency;

public class Child2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("we are in child 2");
        }
    }
}

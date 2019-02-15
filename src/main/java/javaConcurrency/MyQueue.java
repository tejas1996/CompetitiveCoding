package javaConcurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyQueue {
    private Queue queue = new LinkedList();
    private ReentrantLock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();
    private int size = 0;

    public MyQueue(int size) {
        this.size = size;
    }

    public void put(int a) throws InterruptedException {
        lock.lock();
        try {

            while (queue.size() == size) {
                notFull.await();
            }
            queue.add(a);
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public int get() throws InterruptedException {

        int ans = 0;
        lock.lock();
        try {

            while (queue.size() == 0) {
                notEmpty.await();
            }
            ans = (int) queue.poll();
            notFull.signalAll();
        } finally {
            lock.unlock();
        }

        return ans;
    }
}

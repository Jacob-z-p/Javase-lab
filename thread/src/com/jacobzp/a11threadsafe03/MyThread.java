package com.jacobzp.a11threadsafe03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static int ticket = 0;

    static final Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {
            if (extracted()) break;
        }

    }

    private boolean extracted() {
        lock.lock();
        try {
            if (ticket == 100) {
                return true;
            }
            else {
                Thread.sleep(100);
                ticket++;
                System.out.println(getName() + "正在卖第" + ticket + "张票");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
        return false;
    }
}

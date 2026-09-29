package com.jacobzp.a09threadsafe01;

public class MyThread extends Thread {

    static int ticket = 0;

    static final Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                }
                else {
                    break;
                }
            }
        }
    }

}

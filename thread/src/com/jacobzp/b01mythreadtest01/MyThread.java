package com.jacobzp.b01mythreadtest01;

public class MyThread extends Thread {

    static int ticket = 0;

    static final Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ticket == 1000) {
                    break;
                }
                else {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + " 在卖第 " + ticket + " 张票" + ", 电影票剩余张数: " + (1000 - ticket));
                }
            }
        }
    }
}

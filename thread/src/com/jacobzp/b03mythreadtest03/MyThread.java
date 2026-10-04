package com.jacobzp.b03mythreadtest03;

public class MyThread extends Thread {

    static int num = 0;

    static final Object lock = new Object();

    @Override
    public void run() {

        while (true) {
            synchronized (lock) {
                if (num == 100) {
                    break;
                }
                else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    num++;
                    if (num % 2 == 1) {
                        System.out.println(getName() + "获取奇数: " + num);
                    }
                }
            }
        }

    }
}

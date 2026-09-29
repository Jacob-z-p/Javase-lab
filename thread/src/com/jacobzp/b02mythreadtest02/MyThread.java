package com.jacobzp.b02mythreadtest02;

public class MyThread extends Thread {

    static int giftNum = 100;

    static final Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (giftNum < 10) {
                    break;
                }
                else {
                    giftNum--;
                    System.out.println(getName() + ", 剩余礼物数量为 " + giftNum);
                }
            }
        }
    }
}

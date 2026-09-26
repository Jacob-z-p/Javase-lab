package com.jacobzp.a01threadcase01;

public class MyThread extends Thread {

    /**
     * 重写run方法
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }

}

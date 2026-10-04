package com.jacobzp.c01threadpool01;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }

//        System.out.println(Thread.currentThread().getName() + "---");
    }
}

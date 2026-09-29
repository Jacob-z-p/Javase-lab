package com.jacobzp.a12deadlock;

public class ThreadDemo {

    public static void main(String[] args) {
        /**
         *  模拟测试死锁
         */

        // 创建线程
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("线程A");
        t2.setName("线程B");

        // 启动线程
        t1.start();
        t2.start();

    }

}

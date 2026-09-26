package com.jacobzp.a01threadcase01;

public class ThreadDemo {

    public static void main(String[] args) {
        /**
         * 创建线程的第一种方式:
         *  1.创建类继承Thread
         *  2.重写run方法
         *  3.创建实例并启动线程
         */
        // 创建两个线程实例
        MyThread t1 = new MyThread(); t1.setName("线程1");
        MyThread t2 = new MyThread(); t2.setName("线程2");

        // 启动线程
        t1.start();
        t2.start();

    }

}

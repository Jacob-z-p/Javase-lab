package com.jacobzp.a02threadcase02;

public class ThreadDemo {

    public static void main(String[] args) {
        /**
         * 多线程的第二种启动方式:
         *  1.自己定义一个类实现Runnable接口
         *  2.重写里面的run方法
         *  3.创建自己类的对象
         *  4.创建一个Thread类的对象,并开启线程
         */
        // 创建自己类的对象
        MyRun mr = new MyRun();

        // 创建两个线程
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.setName("线程1");
        t2.setName("线程2");

        // 开启线程
        t1.start();
        t2.start();

    }

}

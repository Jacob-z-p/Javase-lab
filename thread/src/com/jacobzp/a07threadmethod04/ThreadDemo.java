package com.jacobzp.a07threadmethod04;

import com.jacobzp.a01threadcase01.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {
        /**
         *  public static void yield()  出让线程/礼让线程
         */

        // 创建线程
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("线程1");
        t2.setName("线程2");

        // 启动线程
        t1.start();
        t2.start();

    }
}

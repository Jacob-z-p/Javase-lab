package com.jacobzp.b03mythreadtest03;

public class ThreadTest {

    public static void main(String[] args) {
        /**
         * 练习三:
         *  同时开启两个线程，共同获取1-100之间的所有数字。
         *  要求：将输出所有的奇数
         */

        // 创建线程
        MyThread t1 = new MyThread(); t1.setName("线程1");
        MyThread t2 = new MyThread(); t2.setName("线程2");

        // 启动线程
        t1.start();
        t2.start();

    }

}

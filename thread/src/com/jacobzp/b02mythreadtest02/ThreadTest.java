package com.jacobzp.b02mythreadtest02;

public class ThreadTest {

    public static void main(String[] args) {
        /**
         * 练习二:
         *  有100份礼品，两人同时发送，当剩下的礼品小于10份的时候则不再送出。
         *  利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来。
         */

        // 创建线程
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // 启动线程
        t1.start();
        t2.start();

    }

}

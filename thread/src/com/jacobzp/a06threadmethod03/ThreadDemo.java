package com.jacobzp.a06threadmethod03;

import com.jacobzp.a01threadcase01.MyThread;

public class ThreadDemo {

    public static void main(String[] args) {
        /**
         *  final void setDaemon(boolean on)    设置守护线程
         *  细节:
         *      当其它的非守护线程执行完毕之后，守护线程会陆续结束
         *  通俗易懂:
         *      当非守护线程结束了，那么守护线程也没有存在的必要了
         */

        // 创建线程
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setName("非守护线程");
        t2.setName("守护线程");

        // 把第二个线程设置为守护线程
        t2.setDaemon(true);

        // 启动线程
        t1.start();
        t2.start();

    }

}

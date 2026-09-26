package com.jacobzp.a05threadmethod02;

public class ThreadDemo {

    public static void main(String[] args) {
        /**
         *  setPriority(int newPriority)    设置线程的优先级
         *  final int getPriority()         获取线程的优先级
         */

        // 创建线程要执行的参数对象
        MyRunnable mr = new MyRunnable();

        // 创建线程对象
        Thread t1 = new Thread(mr, "线程1");
        Thread t2 = new Thread(mr, "线程2");

        // 设置线程优先级
        t1.setPriority(1);
        t2.setPriority(10);

        // 启动线程
        t1.start();
        t2.start();

        // 查看当前main线程的优先级
        System.out.println(Thread.currentThread().getPriority());

    }

}

package com.jacobzp.b04mythreadtest04;

public class ThreadTest {

    public static void main(String[] args) {
        /**
         * 练习四:
         *  抢红包也用到了多线程
         *  假设：100块，分成了3个红包，现在有5个人去抢
         *  其中，红包是共享数据
         *  5个人是5条线程
         *  打印结果如下：
         *      XXX抢到了XXX元
         *      XXX抢到了XXX元
         *      XXX抢到了XXX元
         *      XXX没抢到
         *      XXX没抢到
         */

        // 创建线程
        MyThread t1 = new MyThread(); t1.setName("小明");
        MyThread t2 = new MyThread(); t2.setName("小红");
        MyThread t3 = new MyThread(); t3.setName("小黄");
        MyThread t4 = new MyThread(); t4.setName("小蓝");
        MyThread t5 = new MyThread(); t5.setName("小蔡");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}

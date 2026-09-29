package com.jacobzp.a13waitandnotify;

public class ThreadDemo {

    public static void main(String[] args) {
        /**
         * 通过生产者消费者模式实现等待唤醒机制:
         *  · 生产者:
         *      - 等待:桌子上有面条就等待
         *      - 唤醒:消费者吃面条就唤醒
         *  · 消费者:
         *      - 等待:桌子上没面条就等待
         *      - 唤醒:生产者做面条就唤醒
         */

        // 创建生产者、消费者线程
        Cook c = new Cook();
        Foodie f = new Foodie();
        c.setName("生产者");
        f.setName("消费者");

        // 启动线程
        c.start();
        f.start();

    }

}

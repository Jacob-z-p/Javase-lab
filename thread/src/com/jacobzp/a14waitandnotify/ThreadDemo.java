package com.jacobzp.a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {

    public static void main(String[] args) {
        /**
         * 通过阻塞队列实现等待唤醒机制
         */

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        // 创建线程
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        // 启动线程
        c.start();
        f.start();
    }

}

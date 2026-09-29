package com.jacobzp.a13waitandnotify;

/**
 * 消费者
 */
public class Foodie extends Thread {

    @Override
    public void run() {
        while (true) {
            // 加锁
            synchronized (Desk.lock) {
                // 判断食物是否已经吃完了
                if (Desk.count == 0) {
                    break;
                }
                // 判断桌子是否有面条
                if (Desk.foodFlag == 0) {
                    // 如果没有，就等待
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {
                    // 如果有，就吃面条(注意维护对应的性质)
                    Desk.count--;
                    Desk.foodFlag = 0;
                    System.out.println(getName() + "在吃面条,剩余面条数为 " + Desk.count);

                    // 吃完后，唤醒生产者继续做
                    Desk.lock.notifyAll();
                }
            }
        }
    }

}

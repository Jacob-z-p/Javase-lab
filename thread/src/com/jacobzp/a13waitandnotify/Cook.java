package com.jacobzp.a13waitandnotify;

public class Cook extends Thread {

    @Override
    public void run() {
        while (true) {
            // 加锁
            synchronized (Desk.lock) {
                // 判断食物是否已经吃完
                if (Desk.count == 0) {
                    break;
                }
                // 判断桌子是否有面条
                if (Desk.foodFlag == 1) {
                    // 如果有，就等待
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {
                    // 如果没有，就做面条(注意维护对应的性质)
                    Desk.foodFlag = 1;
                    System.out.println(getName() + "在做面条");
                    // 做完后，唤醒消费者吃面条
                    Desk.lock.notifyAll();
                }
            }
        }
    }

}

package com.jacobzp.b04mythreadtest04;

import java.util.concurrent.ThreadLocalRandom;

public class MyThread extends Thread {

    static int personNum = 0;
    static int money = 100;

    static final Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            if (personNum == 5) {
                return;
            }
            else if (personNum >= 3 && personNum < 5) {
                personNum++;
                System.out.println(getName() + " 没抢到");
            }
            else {
                personNum++;
                if (personNum == 1) {
                    int num = ThreadLocalRandom.current().nextInt(1, money-1);
                    money -= num;
                    System.out.println(getName() + " 抢到了 " + num + " 元");
                }
                else if (personNum == 2) {
                    int num = ThreadLocalRandom.current().nextInt(1, money);
                    money -= num;
                    System.out.println(getName() + " 抢到了 " + num + " 元");
                }
                else if (personNum == 3) {
                    System.out.println(getName() + " 抢到了 " + money + " 元");
                    money -= money;
                }
            }
        }
    }
}

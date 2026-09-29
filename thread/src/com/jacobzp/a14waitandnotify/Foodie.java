package com.jacobzp.a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

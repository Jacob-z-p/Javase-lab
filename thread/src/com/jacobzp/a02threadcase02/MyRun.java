package com.jacobzp.a02threadcase02;

public class MyRun implements Runnable  {

    @Override
    public void run() {
        // 获取当前线程对象
        Thread t = Thread.currentThread();
        // 实现任务
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName() + ": " + i);
        }
    }
}

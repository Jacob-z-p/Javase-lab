package com.jacobzp.a10threadsafe02;

public class MyRunnable implements Runnable {
    
    int ticket = 0;

    @Override
    public void run() {
        
        while (true) {
            if (extracted()) break;
        }
        
    }

    private synchronized boolean extracted() {
        if (ticket == 100) {
            return true;
        }
        else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
        }
        return false;
    }
}

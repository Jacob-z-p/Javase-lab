package com.jacobzp.a13waitandnotify;

/**
 * 用于放面条的桌子
 */
public class Desk {

    // 信号量:判断桌子是否有面条
    public static int foodFlag = 0;

    // 可做的食物的总数
    public static int count = 10;

    // 锁对象
    public static Object lock = new Object();

}

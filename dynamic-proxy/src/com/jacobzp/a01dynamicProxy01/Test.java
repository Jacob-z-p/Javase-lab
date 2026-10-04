package com.jacobzp.a01dynamicProxy01;

public class Test {

    public static void main(String[] args) {
        // 1.获取代理的对象
        BigStar bigStar = new BigStar("鸡哥");
        Star proxyStar = ProxyUtil.createProxy(bigStar);

        // 2.调用唱歌的方法
        String result = proxyStar.sing("只因你太美");
        System.out.println(result);

        // 3.调用跳舞的方法
        proxyStar.dance();
    }

}

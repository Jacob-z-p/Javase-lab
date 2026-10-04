package com.jacobzp.a01dynamicProxy01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建代理
 */
public class ProxyUtil {

    /**
     * 给明星对象创建代理
     * 形参: 被代理的明星对象
     * 返回值: 给明星创建的代理
     */
    public static Star createProxy(BigStar bigStar) {
        Star star = (Star) Proxy.newProxyInstance(
                Star.class.getClassLoader(),  // 使用目标接口的类加载器
                new Class[]{Star.class}, // 指定接口
                // 指定生成的代理要干什么事情
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /**
                         * 参数1：代理的对象
                         * 参数2：要运行的方法
                         * 参数3：方法中传递的实参
                         */

                        // 1.如果是“唱歌”就准备话筒，如果是“跳舞”就准备场地
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒并收钱");
                        }
                        else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地并收钱");
                        }

                        // 2.调用代理对象的方法 -> 通过反射
                        return method.invoke(bigStar, args);
                    }
                }   // 通过匿名内部类实现InvocationHandler接口
        );
        return star;
    }

}

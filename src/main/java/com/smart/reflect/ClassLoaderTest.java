package com.smart.reflect;

/**
 * @Author ws
 * @create 2023/3/15 15:52
 * @Description
 *
 *
 * JVM装载类采用全盘负责委托机制
 * 全盘负责：指的是当一个ClassLoader装载一个类的时候，除非显式地使用另一个
 * ClassLoader,该类所依赖及引用的类也由这个ClassLoader载入：
 * 委托机制：是指先委托父装载器寻找目标类，只有在找不到的情况下，才从自己的类路径中查找
 * 并装载目标类
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader loader=Thread.currentThread().getContextClassLoader();

        System.out.println("Current:"+loader);
        System.out.println("parenet:"+loader.getParent() );

        System.out.println("grandParent:"+loader.getParent().getParent());
    }
}

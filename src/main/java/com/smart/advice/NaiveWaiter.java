package com.smart.advice;

/**
 * @Author ws
 * @create 2023/3/17 10:05
 * @Description
 */
public class NaiveWaiter implements Waiter{
    public void greetTo(String name) {
        System.out.println("greet to"+name+",,,");
    }

    public void serveTo(String name) {
        System.out.println("serving "+name+"...");
    }


}

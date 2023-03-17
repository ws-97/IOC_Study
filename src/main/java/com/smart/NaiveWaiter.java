package com.smart;

import com.smart.advice.Waiter;

/**
 * @Author ws
 * @create 2023/3/17 11:46
 * @Description
 */
public class NaiveWaiter implements Waiter {
    public void greetTo(String clientName) {
        System.out.println("NavieWaiter:greet to"+clientName+"....");
    }

    public void serveTo(String clientName) {
        System.out.println("naiveWaiter:serving"+clientName+"...");

    }
}

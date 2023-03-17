package com.smart.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author ws
 * @create 2023/3/17 10:36
 * @Description
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {
    //在目标类方法调用后执行
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {

        System.out.println("Please enjoy yourself");
    }

}

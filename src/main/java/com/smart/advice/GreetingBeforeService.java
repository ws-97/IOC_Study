package com.smart.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author ws
 * @create 2023/3/17 10:06
 *@Description
 * MethodBeforeAdvice是前值增前的接口
 */
public class GreetingBeforeService implements MethodBeforeAdvice {


    /*
    在目标类方法调用前执行
    method为目标类方法
    args为目标类方法的入参
    obg为目标类实例
    当该方法发生异常的时候，将阻止目标列方法的执行
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String clientName=(String)args[0];
        System.out.println("How are you! mr."+clientName+".");
    }




}

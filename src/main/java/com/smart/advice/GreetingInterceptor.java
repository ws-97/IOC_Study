package com.smart.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author ws
 * @create 2023/3/17 10:39
 * @Description
 */
public class GreetingInterceptor implements MethodInterceptor {







    public Object invoke(MethodInvocation methodInvocation)
            throws Throwable {

        Object[] args=methodInvocation.getArguments();
        String clientName=(String)args[0];
        System.out.println("How are you! mr."+clientName+".");
        //通过反射机制调用目标方法
        Object obj=methodInvocation.proceed();
        System.out.println("please enjoy yourself");
        return obj;
    }



}










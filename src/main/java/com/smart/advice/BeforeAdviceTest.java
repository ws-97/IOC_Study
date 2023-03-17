package com.smart.advice;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.testng.annotations.Test;

/**
 * @Author ws
 * @create 2023/3/17 10:10
 * @Description
 */
public class BeforeAdviceTest {

    @Test
    public void before(){
        Waiter target=new NaiveWaiter() ;
        BeforeAdvice advice=new GreetingBeforeService();
        AfterAdvice afterAdvice=new GreetingAfterAdvice();
        //SPring提供的代理工厂
        ProxyFactory pf=new ProxyFactory();
        //设置代理目标
        pf.setTarget(target);
        //为代理目标添加增强
        pf.addAdvice(advice);
        pf.addAdvice(afterAdvice);
        //生成代理实例
        Waiter proxy= (Waiter) pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");

    }

}

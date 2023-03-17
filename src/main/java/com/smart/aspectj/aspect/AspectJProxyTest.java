package com.smart.aspectj.aspect;

import com.smart.advice.NaiveWaiter;
import com.smart.advice.Waiter;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @Author ws
 * @create 2023/3/17 14:33
 * @Description
 */
public class AspectJProxyTest {
    Waiter target=new NaiveWaiter();

    AspectJProxyFactory factory=new AspectJProxyFactory();
    //设置目标对象



}

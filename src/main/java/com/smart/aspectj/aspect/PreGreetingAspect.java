package com.smart.aspectj.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author ws
 * @create 2023/3/17 11:48
 * @Description
 */
@Aspect //通过该注解将PreGreetingAspect标识为一个切面
public class PreGreetingAspect {

    //定义切点和增强 类型

    /**
     * @Before表示该增强是前置增强，而成员值是一个@AspectJ切点表达式
     * 他的意思是在目标类的greetTo()方法上织入增强，greetTo()方法
     * 可以带任意的入参和任意的返回值
     */
    @Before("execution(* greetTo(..))")
    public void beforeGreeting(){//增强的横切逻辑
        System.out.println("How are you ");

    }
}

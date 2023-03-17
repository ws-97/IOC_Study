package com.smart.aspectj.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author ws
 * @create 2023/3/17 11:22
 * @Description
 */

/**
 * RetentionPolicy.RUNTIME:注解信息在目标类加载到JVM后依然保留，
 * 在运行期可以通过反射读取类中的注解信息
 */
@Retention(RetentionPolicy.RUNTIME)//声明注解的保留期限
/*
ElementType.METHOD:表示NeedTest这个注解只能应用到目标类的方法上
 */
@Target(ElementType.METHOD)//声明可以使用该注解的目标类型
public @interface NeedTest {//定义注解
    /*
    一个注解可以拥有多个成员，成员声明和接口方法声明类似，这里仅仅定义
    一个成员
    成员类型是受限的，合法的类型包括原始类型及其封装类
     */
    boolean value() default true;//声明注解成员

}

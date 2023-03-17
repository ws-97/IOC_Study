package com.smart.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author ws
 * @create 2023/3/15 16:21
 * @Description
 */
public class PrivateCarReflect {

    public static void main(String[] args) throws Throwable {
        ClassLoader loader=Thread.currentThread().getContextClassLoader();
        Class clazz=loader.loadClass("com.smart.reflect.PrivateCar");
        PrivateCar pcar= (PrivateCar) clazz.newInstance();
        Field colorFld=clazz.getDeclaredField("color");
        //1取消java语言访问检查以方便访问
        colorFld.setAccessible(true);
        colorFld.set(pcar,"红色");

        Method driveMtd=clazz.getDeclaredMethod("drive",(Class[])null );

        driveMtd.setAccessible(true);
        driveMtd.invoke(pcar,(Object[]) null);


    }

}

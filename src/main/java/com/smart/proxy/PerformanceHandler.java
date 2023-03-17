package com.smart.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author ws
 * @create 2023/3/16 21:13
 * @Description
 */
public class PerformanceHandler implements InvocationHandler {
    private Object target;

    //Target为目标业务类
    public PerformanceHandler(Object target) {
        this.target = target;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //通过反射方法调用业务类的目标方法
        PerformanceMonitor.begin(target.getClass().getName()+
                "."+method.getName());
        Object obj=method.invoke(target,args);
        PerformanceMonitor.end();
        return obj;

    }
}

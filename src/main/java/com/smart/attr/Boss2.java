package com.smart.attr;

import com.smart.Car;
import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @Author ws
 * @create 2023/3/16 10:38
 * @Description
 */
public class Boss2 implements MethodReplacer {
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        Car car=new Car();
        car.setBrand("美人豹");
        return car;
    }



}

package com.smart.reflect;

/**
 * @Author ws
 * @create 2023/3/15 16:18
 * @Description
 */
public class PrivateCar {
    //1:private成员变量:使用传统的类实例调用方式，只能在本类中访问
    private String color;

    //protected方法，使用传统的类实例调用方法，只能在子类和本包中访问
    protected  void drive(){
        System.out.println("drive private car! the color is:"+color);
    }



}

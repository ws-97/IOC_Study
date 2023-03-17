package com.smart.reflect;

import com.smart.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author ws
 * @create 2023/3/15 15:32
 * @Description
 */
public class ReflectTest {
    public static Car initByDefaultConst() throws Throwable{
        //1.通过类装载器获取Car类对象
        /*

       类装载器就是寻找类的字节码文件并构造出类在JVM内部表示对象的组件
       类装载器把一个类装入JVM中，需要经过以下步骤：
       1.装载：查找和导入Class文件
       2。链接：执行校验，准备和解析步骤，其中解析步骤是可以选择的
                1.校验：检查载入Class文件数据的正确性
                2.准备：给类的静态变量分配存储控件
                3.解析：将符号引用转换成直接引用
       3.初始化：对类的静态变量，静态代码块执行初始化工作


      JVM在运行时会产生3个ClassLoader:
      根装载器，
      ExtClassLoader(扩展器类装载器），负责装载JRE扩展目录ext中的JAR类包
      AppClassLoader(应用类装载器)，负责装载Classpath路径下的类包

         */
        ClassLoader loader=Thread.currentThread().getContextClassLoader();
        Class clazz=loader.loadClass("com.smart.Car");

        //2.获取累的默认构造器并通过它实例化Car
        Constructor constructor=clazz.getDeclaredConstructor((Class[])null);
        Car car=(Car)constructor.newInstance();

        //3.通过反射方法设置属性
        Method setBrand=clazz.getMethod("setBrand",String.class);
        setBrand.invoke(car,"红旗CA72");
        Method setColor=clazz.getMethod("setColor",String.class);
        setColor.invoke(car,"黑色");
        Method setMaxSpeed=clazz.getMethod("setMaxSpeed",int.class);
        setMaxSpeed.invoke(car,200);
        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car=initByDefaultConst();
        car.introduce();
    }


}

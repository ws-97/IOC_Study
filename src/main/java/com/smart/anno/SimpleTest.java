package com.smart.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ws
 * @create 2023/3/16 18:06
 * @Description
 */
public class SimpleTest {
    public static void main(String[] args) {
        //启动容器
        ApplicationContext etx=new ClassPathXmlApplicationContext(
                "beans.xml");
        ((ClassPathXmlApplicationContext)etx).destroy();
    }
}

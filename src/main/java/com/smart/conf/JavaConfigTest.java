package com.smart.conf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author ws
 * @create 2023/3/16 18:36
 * @Description
 */
public class JavaConfigTest {
    public static void main(String[] args) {
        //使用@Configuration类提供的Bean定义信息启动容器
        ApplicationContext ctx=
                new AnnotationConfigApplicationContext(Appconf.class);
        LogonService logonService=ctx.getBean(LogonService.class);
        logonService.printHello();
    }
}

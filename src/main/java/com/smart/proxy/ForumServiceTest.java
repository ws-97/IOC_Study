package com.smart.proxy;

import org.testng.annotations.Test;

import java.lang.reflect.Proxy;

/**
 * @Author ws
 * @create 2023/3/17 09:18
 * @Description
 */
public class ForumServiceTest {

    @Test
    public void proxy(){
        //希望被代理的目标业务类
        ForumService target=new ForumServiceImpl();
        //将目标业务类和横切代码编织到一起
        PerformanceHandler handler=new PerformanceHandler(target);
        //3.根据编制了目标业务类逻辑和性能监视横切逻辑的
        //InvocationHandler实例创建代理实例
        ForumService proxy= (ForumService) Proxy.newProxyInstance(
                target.getClass().getClassLoader()
        ,target.getClass().getInterfaces(),
                handler);
        //调用代理示例
        proxy.removeForum(10);
        proxy.removeTopic(1012);


        System.out.println("\n\n\n\n\n\n");

        CglibProxy proxy1=new CglibProxy();
        ForumServiceImpl forumService= (ForumServiceImpl) proxy1.getProxy(ForumServiceImpl.class);
        forumService.removeForum(10);
        forumService.removeTopic(1023);
    }
}

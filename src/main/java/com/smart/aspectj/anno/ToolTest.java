package com.smart.aspectj.anno;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @Author ws
 * @create 2023/3/17 11:39
 * @Description
 */
public class ToolTest {

    @Test
    public void tool(){
        //得到ForumService对应的Class对象
        Class clazz= ForumService.class;
        //2.得到ForumService对应的Method数组
        Method[] methods=clazz.getDeclaredMethods();
        System.out.println(methods.length);

        for(Method method:methods){
            //3.获取方法上所标注的注解对象
            NeedTest nt=method.getAnnotation(NeedTest.class);
            if(nt!=null){
                if(nt.value()){
                    System.out.println(method.getName()+"()需要测试");
                }else{
                    System.out.println(method.getName()+"()不需要测试");

                }
            }
        }
    }
}

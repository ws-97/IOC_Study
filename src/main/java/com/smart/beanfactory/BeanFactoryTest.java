package com.smart.beanfactory;

import com.smart.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.testng.annotations.Test;

/**
 * @Author ws
 * @create 2023/3/15 17:43
 * @Description
 */
public class BeanFactoryTest {
    @Test
    public void getBean() throws Throwable{
        ResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
        Resource res=resolver.getResource(
                "classpath:com/smart/beanfactory/beans.xml"
        );
        System.out.println(res.getURL());


//        //被废弃。不建议使用
        BeanFactory bf=new XmlBeanFactory(res);
        Car  carq=bf.getBean("car",Car.class);
        System.out.println("老方法：");
        carq.introduce();


        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);


        System.out.println("init BeanFactory.");




        Car car=factory.getBean("car",Car.class);
        System.out.println("car bean is ready for user！");
        car.introduce();

    }
}

package com.smart.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.util.Assert;

import static org.testng.Assert.assertNotNull;

/**
 * @Author ws
 * @create 2023/3/15 17:13
 * @Description
 */
public class PatternResolverTest {

    public void getResources() throws Throwable{
        ResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();

        //1/加载所有类包com.smart 以及子孙包下以.xml为后缀的资源
        /*
        由于资源路径为"classpath*:"
        所以PathMatchingResourceResolver将扫描所有类路径下以及
        JAR包中对应com.smart类包下的路径，读取所有以.xml为后缀的文件资源
         */
        Resource resources[] =resolver.getResources(
                "classpath*:com/smart/**/*.xml"
        );

        assertNotNull(resources);
        for(Resource resource:resources){

            System.out.println(resource.getDescription());
        }



    }
}

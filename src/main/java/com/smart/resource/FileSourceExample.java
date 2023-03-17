package com.smart.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Author ws
 * @create 2023/3/15 16:37
 * @Description
 */
public class FileSourceExample {
    public static void main(String[] args) throws Throwable {
        try {
            String filePath="/Users/ws/Downloads/guide-idea-plugin-main 2/IOC_Study/src/main/java/com/smart/resource/file1.txt";
            //1.使用系统文件路径加载文件
            WritableResource res1=new PathResource(filePath);


            //2使用类路径方式加载文件
            Resource res2=new ClassPathResource("./file1.txt");

            //3使用WriteableResource接口写资源文件
            OutputStream stream1=res1.getOutputStream();

            stream1.write("欢迎光临\n 小春论坛".getBytes());
            stream1.close();

            //4.使用Resource接口读资源文件
            InputStream ins1=res1.getInputStream();
            InputStream ins2=res2.getInputStream();

            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            int i;
            while ((i=ins1.read())!=-1){
                baos.write(i);
            }
            System.out.println(baos.toString());

            System.out.println("res1:"+res1.getFilename());
            System.out.println("res2:"+res2.getFilename());


        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

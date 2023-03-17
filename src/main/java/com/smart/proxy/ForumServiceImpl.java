package com.smart.proxy;


/**
 * @Author ws
 * @create 2023/3/16 20:39
 * @Description
 */
public class ForumServiceImpl implements ForumService {

    public void removeTopic(int topicId){
//        PerformanceMonitor.begin("com.smart.proxy.ForumServiceImpl.removeTopic");
        //1.开始对该方法进行性能监视
        System.out.println("模拟删除Topic记录"+topicId);

        try {
            Thread.currentThread().sleep(20);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        //2.结束对该方法的性能监视

//        PerformanceMonitor.end();


    }


    public void removeForum(int forumId){
        //1.开始对该方法进行性能监视
//        PerformanceMonitor.begin(
//                "com.smart.proxy.ForumServiceImpl.removeForum"
//        );
        System.out.println("模拟删除Forum记录："+forumId);
        try {
            Thread.currentThread().sleep(40);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        //2.结束对该方法的性能监视

//     PerformanceMonitor.end();
    }


}

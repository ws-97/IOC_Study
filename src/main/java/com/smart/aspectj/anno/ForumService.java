package com.smart.aspectj.anno;

/**
 * @Author ws
 * @create 2023/3/17 11:35
 * @Description
 */
public class ForumService {
    @NeedTest
    public void deleteForum(int forumId){
        System.out.println("删除论坛模块："+forumId);
    }


    @NeedTest(value = false)
    public void deleteTopic(int postId){
        System.out.println("删除论坛主题："+postId);
    }
}

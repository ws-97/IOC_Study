package com.smart.proxy;


/**
 * @Author ws
 * @create 2023/3/16 20:59
 * @Description
 */
public class TestForumService {
    public static void main(String[] args) {
        ForumService forumService=new ForumServiceImpl();
        forumService.removeForum(10);
        forumService.removeTopic(1012);
    }
}

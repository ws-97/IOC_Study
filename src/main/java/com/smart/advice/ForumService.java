package com.smart.advice;

import java.sql.SQLException;

/**
 * @Author ws
 * @create 2023/3/17 10:45
 * @Description
 */
public class ForumService {

    public void removeForum(int forumId){
        throw  new RuntimeException("运行异常。");
    }

//    public void updateForum(Forum forum) throws Exception{
//        throw  new SQLException("数据更新操作异常");
//    }
}

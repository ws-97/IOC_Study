//package com.smart.concept;
//
///**
// * @Author ws
// * @create 2023/3/16 20:24
// * @Description
// */
//public class ForumService {
//    private TransactionManager transactionManager;
//    private PerformaceMonitor pmonitor;
//    private TopicDao topicDao;
//    private ForumDao forumDao;
//
//
//    public void removeTopic(int topicId){
//        pmonitor.start();
//        transactionManager.beginTransaction();
//        topicDao.removeTop(topicId);
//        transactionManager.commit();
//        pmonitor.end();
//    }
//
//
//
//    public void createForum(Forum forum){
//        pmonitor.start();
//        transactionManager.beginTransaction();
//        forum.create(forum);
//        transactionManager.commit();
//        pmonitor.end();
//    }
//
//
//
//
//}

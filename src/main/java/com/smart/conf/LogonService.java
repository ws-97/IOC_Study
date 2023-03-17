package com.smart.conf;

import com.smart.anno.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author ws
 * @create 2023/3/16 18:24
 * @Description
 */
public class LogonService {
    private LogDao logDao;

    private UserDao userDao;


    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public LogDao getLogDao() {
        return logDao;
    }

    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }

    public void printHello(){
        System.out.println("调用了printHello");
    }
}

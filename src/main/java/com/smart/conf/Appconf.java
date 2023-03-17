package com.smart.conf;

import com.smart.anno.UserDao;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @Author ws
 * @create 2023/3/16 18:20
 * @Description
 */
@Configurable
public class Appconf {

    //以下两个方法定义了两个Bean,并提供了Bean的实例化逻辑
    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

    @Bean
    public LogDao logDao() {
        return new LogDao();
    }


    //定义LoginService的Bean
    @Bean
    public LogonService logonService() {
        LogonService logonService = new LogonService();
        //J将上述定义的bean注入LoginService Bean中
        logonService.setLogDao(logDao());
        logonService.setUserDao(userDao());
        return logonService;
    }


}

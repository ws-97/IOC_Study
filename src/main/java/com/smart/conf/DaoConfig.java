package com.smart.conf;

import com.smart.anno.UserDao;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @Author ws
 * @create 2023/3/16 18:29
 * @Description
 */
@Configurable
public class DaoConfig {

    @Bean
    public UserDao userDao(){
        return new UserDao();
    }

    @Bean
    public LogDao logDao(){
        return new LogDao();
    }



}

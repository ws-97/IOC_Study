package com.smart.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @Author ws
 * @create 2023/3/16 18:31
 * @Description
 */

@Configurable
public class ServiceConfig {
    //像普通Bean一样注入DaoConfig
    @Autowired
    private DaoConfig daoConfig;

    @Bean
    public LogonService logonService(){
        LogonService logonService=new LogonService()  ;
        //像普通Bean一样，调用Bean相关犯法
        logonService.setUserDao(daoConfig.userDao());
        logonService.setLogDao(daoConfig.logDao());
        return logonService;
    }


}

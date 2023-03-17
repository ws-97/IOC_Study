package com.smart.beanprop;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Author ws
 * @create 2023/3/16 19:51
 * @Description
 */
public class ApplicationManager {
    @Value("#{sysConfig.sessionTimeOut}")
    private int sessionTimeout;

    @Value("#{sysConfig.maxTabPageNum}")
    private int maxTabPageNum;
}

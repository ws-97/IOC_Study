package com.smart.beanprop;

import javax.sql.DataSource;

/**
 * @Author ws
 * @create 2023/3/16 19:30
 * @Description
 */
public class SysConfig {
    private int sessionTimeOut;
    private int maxTabPageNum;
    private DataSource dataSource;
    //1.模拟从数据库中获取配置值并设置相应的属性
    public void initFromDB(){
        //模拟从数据库中获取配置值
        this.sessionTimeOut=30;
        this.maxTabPageNum=10;
    }

    public int getSessionTimeOut(){
        return  sessionTimeOut;
    }

    public void setSessionTimeOut(int sessionTimeOut) {
        this.sessionTimeOut = sessionTimeOut;
    }

    public int getMaxTabPageNum() {
        return maxTabPageNum;
    }

    public void setMaxTabPageNum(int maxTabPageNum) {
        this.maxTabPageNum = maxTabPageNum;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}

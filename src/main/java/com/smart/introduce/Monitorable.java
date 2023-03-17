package com.smart.introduce;

/**
 * @Author ws
 * @create 2023/3/17 10:58
 * @Description
 */
public interface Monitorable {
    //通过该接口控制业务类性能监视功能的激活和关闭状态
    void setMonitorActive(boolean active);
}

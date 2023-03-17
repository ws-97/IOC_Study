package com.smart.introduce;

import com.smart.attr.Boss;
import com.smart.proxy.PerformanceMonitor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.testng.annotations.Test;

/**
 * @Author ws
 * @create 2023/3/17 11:03
 * @Description
 */
public class ControllablePerformanceMonitor extends
        DelegatingIntroductionInterceptor {
    //用于保存性能监视开关的状态
    private ThreadLocal<Boolean> monitorStatusMap=new
            ThreadLocal<Boolean>();
    public void setMonitorActive(boolean active){
        monitorStatusMap.set(active);
    }


    //拦截方法
    public Object invoke(MethodInvocation mi) throws Throwable{
        Object obj=null;
        //对于支持性能监控可控代理，通过判断器状态决定是否开启性能监控功能
        if(monitorStatusMap.get()!=null&&
        monitorStatusMap.get()){
            PerformanceMonitor.begin(mi.getClass().getName()+
                    "."+mi.getMethod().getName());
            obj=super.invoke(mi);
            PerformanceMonitor.end();
        }else {
            obj=super.invoke(mi);

        }

        return obj;

    }


}

package com.smart.proxy;

/**
 * @Author ws
 * @create 2023/3/16 20:45
 * @Description
 */
public class PerformanceMonitor {
    //1.通过一个ThreadLocal保存与调用线程相关的性能监视信息
    /*ThreadLocal将非线程安全类改造为线程安全类的法宝
     *
     */
    private static  ThreadLocal<MethodPerformance> performanceRecord=
            new ThreadLocal<MethodPerformance>();

    //2启动对某一个目标方法的性能监视
    public static void begin(String method){
        System.out.println("begin monitor....");
        MethodPerformance mp=new MethodPerformance(method);
        performanceRecord.set(mp);
    }

    public static void end(){
        System.out.println("end monitor...");
        MethodPerformance mp=performanceRecord.get();
        //3.打印出方法性能监视的结果信息
        mp.printPerformance();
    }




}

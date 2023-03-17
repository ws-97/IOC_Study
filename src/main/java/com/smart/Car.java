package com.smart;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Author ws
 * @create 2023/3/15 15:29
 * @Description
 */
public class Car implements BeanFactoryAware , BeanNameAware,
        InitializingBean, DisposableBean {

    private String brand;
    private String color;
    private int maxSpeed;
    private double price;

    public Car() {
    }

    public Car(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void introduce(){
        System.out.println("brand:"+brand+";color:"+color+";maxSpeed;"+maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    private BeanFactory beanFactory;
    //BeanFactoryAware接口方法
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware。setBeanfactory()");
        this.beanFactory=beanFactory;
    }
    private String beanName;

    //BeanNameAware接口方法
    public void setBeanName(String s) {
        System.out.println("调用BeanNameWare.setBeanName");

        this.beanName=s;
    }

    //DisposableBean接口方法
    public void destroy() throws Exception {
        System.out.println("调用DispoableBean.destory");
    }

    //InitializingBean接口方法
    public void afterPropertiesSet() throws Exception {

        System.out.println("调用InitializingBean.afterProperties(),");

    }

    public void myInit(){
        System.out.println("调用init-method所制定的myinit()," +
                "将maxspeed设置为24o");
        this.maxSpeed=240;
    }


    public void myDestroy(){
        System.out.println("调用destroy-method所制定的myDestroy");
    }


}


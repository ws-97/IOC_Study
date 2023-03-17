package com.smart.anno;

import com.smart.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author ws
 * @create 2023/3/16 18:00
 * @Description
 */
@Component
public class Boss {

    private Car car;

    public Boss(Car car) {
        this.car = car;
    }

    public Boss() {
        System.out.println("construct..");
    }

    public Car getCar() {
        return car;
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @PostConstruct
    private void init(){
        System.out.println("execute in init1");
    }

    @PostConstruct
    private void init2(){
        System.out.println("execute in init1");
    }

    @PreDestroy
    private void destory1(){
        System.out.println("execute in destory1");
    }

    @PreDestroy
    private void destory2(){
        System.out.println("execute in destory2");
    }

}

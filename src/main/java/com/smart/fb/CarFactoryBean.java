package com.smart.fb;

import com.smart.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author ws
 * @create 2023/3/16 15:14
 * @Description
 */
public class CarFactoryBean implements FactoryBean<Car> {
    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }

    //接受逗号分隔的属性设置信息
    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    //实例化car bean
    public Car getObject() throws Exception {
        Car car=new Car();
        String[] infos=carInfo.split(",");
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.parseInt(infos[1]));
        car.setPrice(Integer.parseInt(infos[2]));
        return car;
    }

    //返回Car的类型
    public Class<Car> getObjectType() {
        return Car.class;
    }

    //标识通过该FactoryBean返回的Bean是singleton
    public boolean isSingleton() {
        return false;
    }
}

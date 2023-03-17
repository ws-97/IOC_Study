package com.smart.attr;

import com.smart.Car;

import java.util.*;

/**
 * @Author ws
 * @create 2023/3/16 09:29
 * @Description
 */
public class Boss {
    private Car car;
    private List  favourite=new ArrayList();

    private Set favourite1=new HashSet();
    private Map map=new HashMap();

    private Properties mails=new Properties();


    private Map<String,Integer> jobTime=new HashMap<String, Integer>();

    public Map<String, Integer> getJobTime() {
        return jobTime;
    }

    public void setJobTime(Map<String, Integer> jobTime) {
        this.jobTime = jobTime;
    }

    public Properties getMails() {
        return mails;
    }

    public void setMails(Properties mails) {
        this.mails = mails;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getFavourite1() {
        return favourite1;
    }

    public void setFavourite1(Set favourite1) {
        this.favourite1 = favourite1;
    }

    public List getFavourite() {
        return favourite;
    }

    public void setFavourite(List favourite) {
        this.favourite = favourite;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

package com.wwclr.consumer.entity;

import java.util.Date;

/**
 * Created by wwclr on 2019/3/4.
 */
public class Student {

    private String userId;
    private String name;
    private Integer age;
    private Date birthday;
    private String des;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Student() {
    }

    public Student(String userId, String name, Integer age,Date birthday) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.birthday=birthday;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

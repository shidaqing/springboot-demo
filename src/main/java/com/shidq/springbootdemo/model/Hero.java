package com.shidq.springbootdemo.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Hero {

    private  String name;
    private  int    age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

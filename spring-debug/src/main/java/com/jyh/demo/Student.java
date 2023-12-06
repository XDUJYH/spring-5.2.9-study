package com.jyh.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    public void hello(){
        System.out.println("hello spring");
    }

    public Student() {
        System.out.println("无参构造函数调用了");
    }

    public Student(String name) {
        System.out.println("name构造函数调用了");
        this.name = name;
    }

    public String getName() {
        System.out.println("get方法调用了");
        return name;
    }

    public void setName(String name) {

        System.out.println("set方法调用了");
        this.name = name;
    }
}

package com.jyh.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springContext.xml");
        Student student = (Student) applicationContext.getBean("student1");
        student.hello();
    }
}

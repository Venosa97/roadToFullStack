package com.devmind.springApp.testDependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ITeacher javaTeacherAnnotation = context.getBean("javaTeacher",ITeacher.class);
        System.out.println(javaTeacherAnnotation.getWisdom());
    }
}

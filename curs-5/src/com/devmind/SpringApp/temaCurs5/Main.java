package com.devmind.SpringApp.temaCurs5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Task protoFirstTask = context.getBean("prototypeTask",Task.class);
//        Task protoSecondTask = context.getBean("prototypeTask", Task.class);
//        protoFirstTask.run();
        Task singleTask = context.getBean("singletonTask", Task.class);
        context.close();

    }
}

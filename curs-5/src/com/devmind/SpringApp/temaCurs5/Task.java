package com.devmind.SpringApp.temaCurs5;

import org.springframework.util.SocketUtils;

import java.util.concurrent.ThreadLocalRandom;

public class Task {
    static int uniqueID = 0;
    static int numberOfTasks = 0;
    private String taskName;
    private Integer taskId;
    private Integer executionTime;


    public void run(){
        System.out.println("Run method: ");
        try{
            Thread.sleep(executionTime);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void init(){
        System.out.println("Starting init method");
        System.out.println("numberOfTasks: " + ++numberOfTasks);
        this.taskId = Task.generateId();
        System.out.println("taskId: " + taskId);
        this.taskName = "Task" + " " + taskId;
        System.out.println("taskName: " + taskName);
        this.executionTime = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        System.out.println("executionTime: " + this.executionTime);
        System.out.println("--------------------\n");
    }

    public void destroy(){
        System.out.println("Destroy task: " + this.taskName);
        System.out.println("Tasks in progress: " + --numberOfTasks);
    }
    public static Integer generateId(){
        return ++uniqueID;
    }
}

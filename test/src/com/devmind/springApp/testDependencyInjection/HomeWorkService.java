package com.devmind.springApp.testDependencyInjection;

public class HomeWorkService {
    private String message = "This is my homeWork";

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

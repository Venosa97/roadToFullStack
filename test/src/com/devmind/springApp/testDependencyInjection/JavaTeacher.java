package com.devmind.springApp.testDependencyInjection;

import org.springframework.stereotype.Component;

@Component()
public class JavaTeacher implements ITeacher {

    private WisdomWordsService wisdomService;

    // constructor unic care primeste ca parametru un obiect de tipul WisdomWordsService
    public JavaTeacher(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

    @Override
    public String getHomeWork() {
        return "Do 100 algorithmics problems";
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }
}
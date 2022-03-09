package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        //generating context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //cat
        IAnimal catAnimal = context.getBean("myCat",IAnimal.class);
        System.out.println("Cat sounds: " + catAnimal.makeSound());

        //mouse

        IAnimal mouseAnimal = context.getBean("myMouse",IAnimal.class);
        System.out.println("Mouse sounds: " + mouseAnimal.makeSound());
        //dog with default constructor
        IAnimal dogAnimal = context.getBean("myDog",IAnimal.class);
        System.out.println("Dog sounds: " + dogAnimal.makeSound());

        //dog with 1 param constructor
        Dog myDog = (Dog) dogAnimal;
        System.out.println("Animal name is: " + myDog.getAnimalName());

    }
}

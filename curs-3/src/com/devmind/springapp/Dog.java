package com.devmind.springapp;


public class Dog implements IAnimal{

    private String animalName;

    public Dog(String animalName){
        this.animalName = animalName;
    }

    @Override
    public String makeSound() {
        return "Ham ham";
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}

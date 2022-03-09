package com.devmind.springapp;

public class Cat implements IAnimal{
    @Override
    public String makeSound() {
        return "Miau miau";
    }
}

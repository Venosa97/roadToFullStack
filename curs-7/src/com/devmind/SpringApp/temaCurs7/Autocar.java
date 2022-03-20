package com.devmind.SpringApp.temaCurs7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Autocar implements Automobil {

    private Motor motor;

    @Autowired
    private Roti roti;

    @Autowired(required = false)
    private Greutate greutate;

    @Autowired
    private permisCategorieD permisCategorieD;

    @Autowired
    public Autocar(Motor motor){
        this.motor = motor;
    }
    @Override
    public void travel() {
        System.out.println("Calatorie cu autocarul");
    }

    @Override
    public void maxDrivingSpeed() {
        System.out.println("Viteza maxima este de: 135 km/h");
    }
}

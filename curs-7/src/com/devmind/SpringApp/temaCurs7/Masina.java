package com.devmind.SpringApp.temaCurs7;

import com.devmind.SpringApp.temaCurs7.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class Masina implements Automobil {
    private Motor motor;
    private Roti roti;
    private Greutate greutate;

    @Autowired(required = false)
    private ScauneIncalzite scauneIncalzite;



    @Override
    public void travel() {
        System.out.println("Calatorie cu masina");
    }

    @Override
    public void maxDrivingSpeed() {
        System.out.println("Viteza maxima este de: 210 km/h");
    }

    @Autowired
    public void setMotor(Motor motor){
        this.motor = motor;
    }
}

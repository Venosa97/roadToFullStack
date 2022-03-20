package com.devmind.SpringApp.temaCurs7;

import com.devmind.SpringApp.temaCurs7.CascaProtectie;
import com.devmind.SpringApp.temaCurs7.Greutate;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Motocicleta implements Automobil {

    @Autowired
    private Motor motor;
    private Roti roti;
    private Greutate greutate;
    private CascaProtectie cascaProtectie;

    @Autowired
    public Motocicleta(Roti roti, Greutate greutate, CascaProtectie cascaProtectie){
        this.roti = roti;
        this.greutate = greutate;
        this.cascaProtectie = cascaProtectie;
    }

    @Override
    public void travel() {
        System.out.println("Calatorie cu motocicleta");
    }

    @Override
    public void maxDrivingSpeed() {
        System.out.println("Viteza maxima de 232 km/h");
    }
}

package com.devmind.SpringApp.temaCurs7;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class GenericType {

    @Autowired
    @Qualifier("autocar")
    private Automobil automobilAutocar;

    @Autowired
    @Qualifier("masina")
    private Automobil automobilMasina;

    @Autowired
    @Qualifier("motocicleta")
    private Automobil automobilMotocicleta;
}

package com.devmind.SpringApp.temaCurs7;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class Motor {
    String motor;
    Double putere;
    Integer numarCilindri;

}

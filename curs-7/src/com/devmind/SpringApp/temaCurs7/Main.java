package com.devmind.SpringApp.temaCurs7;

import com.devmind.SpringApp.temaCurs7.Autocar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Motocicleta motocicleta = context.getBean("motocicleta", Motocicleta.class);
        Autocar autocar = context.getBean("autocar", Autocar.class);
        Masina masina = context.getBean("masina", Masina.class);
        masina.travel();
        GenericType genericType = context.getBean("genericType",GenericType.class);
        Motocicleta motocicleta1 = (Motocicleta) genericType.getAutomobilMotocicleta();
        motocicleta1.travel();
        motocicleta.travel();




    }
}

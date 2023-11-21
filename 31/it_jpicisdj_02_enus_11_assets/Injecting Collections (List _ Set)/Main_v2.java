package com.skillsoft;

import com.skillsoft.auto.CarBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.skillsoft.auto.Car;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(CarBeanConfig.class);

        Car newcar = (Car) appContext.getBean("carBean");

        System.out.println("The car obtained from the Bean:\n" + newcar);
    }
}
package com.skillsoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("\nAbout to retrieve the instantiated beans...\n");
        IOTDevice myFirstDeviceBean = (IOTDevice) appContext.getBean("FridgeBean");
        IOTDevice mySecondDeviceBean = (IOTDevice) appContext.getBean("DishwasherBean");


        System.out.println("First Bean: " + myFirstDeviceBean);
        System.out.println("Second Bean: " + mySecondDeviceBean);

        appContext.close();
    }
}
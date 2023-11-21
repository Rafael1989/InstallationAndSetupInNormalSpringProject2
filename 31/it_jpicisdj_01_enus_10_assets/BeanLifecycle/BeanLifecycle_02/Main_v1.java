package com.skillsoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig.class);

        System.out.println("\nAbout to retrieve the instantiated beans...\n");
        IOTDevice myFirstDeviceBean = (IOTDevice) appContext.getBean("FirstDeviceBean");
        IOTDevice mySecondDeviceBean = (IOTDevice) appContext.getBean("SecondDeviceBean");

        myFirstDeviceBean.setDevice("Fridge");
        myFirstDeviceBean.setDescription("Temperature gauge for the freezer");

        mySecondDeviceBean.setDevice("Dishwasher");
        mySecondDeviceBean.setDescription("Monitors water flow");

        System.out.println("First Bean: " + myFirstDeviceBean);
        System.out.println("Second Bean: " + mySecondDeviceBean);

        appContext.close();
    }
}
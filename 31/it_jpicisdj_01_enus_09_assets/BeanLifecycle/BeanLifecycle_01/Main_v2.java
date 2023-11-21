package com.skillsoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("\nAbout to retrieve the instantiated beans...\n");
        IOTDevice myFirstDeviceBean = (IOTDevice) appContext.getBean("myIOTDeviceBeanOne");
        IOTDevice mySecondDeviceBean = (IOTDevice) appContext.getBean("myIOTDeviceBeanTwo");

        myFirstDeviceBean.setDevice("Fridge");
        myFirstDeviceBean.setDescription("Temperature gauge for the freezer");

        mySecondDeviceBean.setDevice("Dishwasher");
        mySecondDeviceBean.setDescription("Monitors water flow");

        System.out.println("First Bean: " + myFirstDeviceBean);
        System.out.println("Second Bean: " + mySecondDeviceBean);

        appContext.close();
    }
}
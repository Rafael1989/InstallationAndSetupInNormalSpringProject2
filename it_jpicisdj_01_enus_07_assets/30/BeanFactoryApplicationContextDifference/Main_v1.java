package com.skillsoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        IOTDevice myFirstDeviceBean = (IOTDevice) appContext.getBean("myIOTDeviceBeanOne");
//        IOTDevice mySecondDeviceBean = appContext.getBean("myIOTDeviceBeanTwo", IOTDevice.class);
//
//        myFirstDeviceBean.setDevice("Fridge");
//        myFirstDeviceBean.setDescription("Temperature gauge for the freezer");
//
//        mySecondDeviceBean.setDevice("Dishwasher");
//        mySecondDeviceBean.setDescription("Monitors water flow");
//
//        System.out.println("First Bean: " + myFirstDeviceBean);
//        System.out.println("Second Bean: " + mySecondDeviceBean);
    }
}
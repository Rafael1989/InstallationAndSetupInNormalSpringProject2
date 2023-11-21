package com.skillsoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig.class);

        IOTDevice myFirstDeviceBean = appContext.getBean(IOTDevice.class);

        myFirstDeviceBean.setDevice("Fridge");
        myFirstDeviceBean.setDescription("Temperature gauge for the freezer");

        System.out.println("First Bean: " + myFirstDeviceBean);
    }
}
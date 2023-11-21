package com.skillsoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        IOTDevice myDeviceBean = (IOTDevice) appContext.getBean("myIOTDeviceBean");

        System.out.println("Bean from ApplicationContext:\n" + myDeviceBean);

    }
}
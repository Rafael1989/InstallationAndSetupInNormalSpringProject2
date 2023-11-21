package com.skillsoft;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("applicationContext.xml");

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanReader = new XmlBeanDefinitionReader(beanFactory);
        beanReader.loadBeanDefinitions(resource);

        IOTDevice myFirstDeviceBean = (IOTDevice) beanFactory.getBean("myIOTDeviceBeanOne");
        IOTDevice mySecondDeviceBean = beanFactory.getBean("myIOTDeviceBeanTwo", IOTDevice.class);
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
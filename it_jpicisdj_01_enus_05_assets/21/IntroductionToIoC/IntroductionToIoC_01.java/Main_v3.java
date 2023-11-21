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

        IOTDevice myDeviceBean = (IOTDevice) (beanFactory).getBean("myIOTDeviceBean");

        System.out.println("Bean from BeanDefinitionRegistry -- " + myDeviceBean);

    }
}
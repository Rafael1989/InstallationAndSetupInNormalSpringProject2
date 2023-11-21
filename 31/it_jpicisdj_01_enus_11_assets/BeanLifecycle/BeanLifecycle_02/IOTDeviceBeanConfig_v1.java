package com.skillsoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOTDeviceBeanConfig {

    @Bean(name = "FirstDeviceBean", initMethod="initBean", destroyMethod="destroyBean")
    public IOTDevice FirstIOTDeviceBean() {

        return new IOTDevice();
    }

    @Bean(name = "SecondDeviceBean", initMethod="initBean", destroyMethod="destroyBean")
    public IOTDevice SecondIOTDeviceBean() {
        return new IOTDevice();
    }
}

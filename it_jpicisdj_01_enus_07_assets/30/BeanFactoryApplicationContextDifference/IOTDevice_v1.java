package com.skillsoft;

public class IOTDevice {

    String device;
    String description;

    public IOTDevice() {
        System.out.println("Object created successfully!");
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "IOTDevice {" +
                "device = '" + device + "!\'" +
                ", description = '" + description + "\'" + '}';
    }
}

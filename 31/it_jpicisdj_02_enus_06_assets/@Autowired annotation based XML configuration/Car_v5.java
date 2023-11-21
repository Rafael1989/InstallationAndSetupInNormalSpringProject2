package com.skillsoft.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;
    Engine engine;

    public Car(){

        System.out.println("Default constructor in Car has been used");
    }

    public Car(String type, String model, double price, int combinedFuelEconomy, Engine engine) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.engine = engine;

        System.out.println("Parametrized constructor in Car has been used");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCombinedFuelEconomy() {
        return combinedFuelEconomy;
    }

    public void setCombinedFuelEconomy(int combinedFuelEconomy) {
        this.combinedFuelEconomy = combinedFuelEconomy;
    }

    public Engine getEngine() {
        return engine;
    }

    @Autowired(required = false)
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Engine setter accessed in Car");
    }

    @Override
    public String toString() {
        return "CarBodyType = " + type +
                ", Model = " + model +
                ",\nPrice = " + price +
                ",\nCombinedFuelEconomy = " + combinedFuelEconomy +  "mpg" +
                ",\n" + engine;
    }
}

package com.skillsoft.auto;

public class Car {

    String type;
    String model;
    double price;
    int combinedFuelEconomy;
    Engine engine;

    public Car(String type, String model, double price, int combinedFuelEconomy, Engine engine) {
        this.type = type;
        this.model = model;
        this.price = price;
        this.combinedFuelEconomy = combinedFuelEconomy;
        this.engine = engine;
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

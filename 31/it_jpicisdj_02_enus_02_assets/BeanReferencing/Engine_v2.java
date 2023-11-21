package com.skillsoft.auto;

public class Engine {

    int horsepower;
    int maxRPM;
    float displacement;
    String cylinderConfig;
    String recommendedFuel;

    public Engine(int horsepower, int maxRPM, float displacement,
                  String cylinderConfig, String recommendedFuel) {
        this.horsepower = horsepower;
        this.maxRPM = maxRPM;
        this.displacement = displacement;
        this.cylinderConfig = cylinderConfig;
        this.recommendedFuel = recommendedFuel;
    }

    @Override
    public String toString() {
        return "Engine { " +
                "Power = " + horsepower + "-hp @ " + maxRPM + "RPM" +
                ",\nDisplacement = " + displacement +
                ",\nCylinderConfiguration = " + cylinderConfig +
                ",\nRecommendedFuel = " + recommendedFuel + " }";
    }
}
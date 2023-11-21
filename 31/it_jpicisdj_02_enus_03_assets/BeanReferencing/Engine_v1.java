package com.skillsoft.auto;

public class Engine {

    int horsepower;
    int maxRPM;
    float displacement;
    String cylinderConfig;
    String recommendedFuel;

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        this.maxRPM = maxRPM;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public String getCylinderConfig() {
        return cylinderConfig;
    }

    public void setCylinderConfig(String cylinderConfig) {
        this.cylinderConfig = cylinderConfig;
    }

    public String getRecommendedFuel() {
        return recommendedFuel;
    }

    public void setRecommendedFuel(String recommendedFuel) {
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
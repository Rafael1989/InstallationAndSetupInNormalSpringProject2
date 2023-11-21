package com.skillsoft.auto;

public class Gearbox {

    String type;
    int numGears;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    @Override
    public String toString() {
        return "Gearbox { " +
                "Type = " + type +
                ",\nNumGears = " + numGears + " }";
    }
}

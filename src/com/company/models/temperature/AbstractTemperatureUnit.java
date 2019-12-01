package com.company.models.temperature;

public abstract class AbstractTemperatureUnit {
    private double temerature;

    public AbstractTemperatureUnit(double temerature) {
        this.temerature = temerature;
    }

    public AbstractTemperatureUnit() {
    }

    public abstract void printTemperature();

    public double getTemerature() {
        return temerature;
    }

    public void setTemerature(double temerature) {
        this.temerature = temerature;
    }
}

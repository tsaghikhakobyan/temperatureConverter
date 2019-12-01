package com.company.models.temperature;

public abstract class AbstractTemperatureUnit {
    private double temperature;

    public AbstractTemperatureUnit(double temperature) {
        this.temperature = temperature;
    }

    public AbstractTemperatureUnit() {
    }

    public abstract void printTemperature();

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

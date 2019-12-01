package com.company.models.temperature;

public class Celsius extends AbstractTemperatureUnit{
    @Override
    public void printTemperature() {
        System.out.println(getTemperature() + " C");
    }
}

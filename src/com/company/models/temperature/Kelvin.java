package com.company.models.temperature;

public class Kelvin extends AbstractTemperatureUnit {
    @Override
    public void printTemperature() {
        System.out.println(getTemperature() + " K");
    }
}

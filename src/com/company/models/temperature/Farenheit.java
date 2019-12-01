package com.company.models.temperature;

public class Farenheit extends AbstractTemperatureUnit {

    @Override
    public void printTemperature(){
        System.out.println(getTemperature() + " F");
    }
}

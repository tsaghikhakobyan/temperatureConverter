package com.company;

import com.company.converter.Converter;
import com.company.converter.FarenheitConverter;
import com.company.models.temperature.AbstractTemperatureUnit;
import com.company.models.temperature.Kelvin;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Converter fahrenheitConverter = new FarenheitConverter();
        Kelvin kelvin = new Kelvin();
        kelvin.setTemperature(100);
        AbstractTemperatureUnit convert = fahrenheitConverter.convert(kelvin);
        convert.printTemperature();
    }
}

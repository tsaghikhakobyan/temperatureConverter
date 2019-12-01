package com.company;

import com.company.converter.Converter;
import com.company.converter.FarenheitConverter;
import com.company.models.temperature.AbstractTemperatureUnit;
import com.company.models.temperature.Kelvin;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Converter converter = new FarenheitConverter();
        FarenheitConverter farenheitConverter = new FarenheitConverter();
        Kelvin kelvin = new Kelvin();
        kelvin.setTemerature(100);
        AbstractTemperatureUnit convert = farenheitConverter.convert(kelvin);
        convert.printTemperature();
    }
}

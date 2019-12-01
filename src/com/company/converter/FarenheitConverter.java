package com.company.converter;

import com.company.models.temperature.AbstractTemperatureUnit;
import com.company.models.temperature.Celsius;
import com.company.models.temperature.Farenheit;
import com.company.models.temperature.Kelvin;

public class FarenheitConverter implements Converter {

    @Override
    public AbstractTemperatureUnit convert(AbstractTemperatureUnit unit) {
        double temp;
        if (unit instanceof Celsius) {
            temp = unit.getTemerature() * 9 / 5 + 32;
        } else if (unit instanceof Kelvin) {
            temp = unit.getTemerature() * 9 / 5 - 459.67;
        } else {
            temp = unit.getTemerature();
        }
        Farenheit farenheit = new Farenheit();
        farenheit.setTemerature(temp);
        return farenheit;
    }
}

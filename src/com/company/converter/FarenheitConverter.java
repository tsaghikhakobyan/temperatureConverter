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
            temp = unit.getTemperature() * 9 / 5 + 32;
        } else if (unit instanceof Kelvin) {
            temp = unit.getTemperature() * 9 / 5 - 459.67;
        } else {
            temp = unit.getTemperature();
        }
        Farenheit farenheit = new Farenheit();
        farenheit.setTemperature(temp);
        return farenheit;
    }
}

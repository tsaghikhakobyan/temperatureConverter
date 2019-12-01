package com.company.converter;

import com.company.models.temperature.AbstractTemperatureUnit;

public interface Converter {
    AbstractTemperatureUnit convert(AbstractTemperatureUnit unit);
}

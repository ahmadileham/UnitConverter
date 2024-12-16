package com.converter.impl;

import com.converter.service.UnitConversionService;

public class TemperatureConverter implements UnitConversionService {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        if ("celsius".equals(fromUnit) && "fahrenheit".equals(toUnit)) {
            return (value * 9 / 5) + 32;
        } else if ("fahrenheit".equals(fromUnit) && "celsius".equals(toUnit)) {
            return (value - 32) * 5 / 9;
        } else if ("celsius".equals(fromUnit) && "kelvin".equals(toUnit)) {
            return value + 273.15;
        } else if ("kelvin".equals(fromUnit) && "celsius".equals(toUnit)) {
            return value - 273.15;
        }
        throw new IllegalArgumentException("Unsupported units: " + fromUnit + " to " + toUnit);
    }
}

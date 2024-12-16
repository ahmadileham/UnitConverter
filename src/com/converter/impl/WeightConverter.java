package com.converter.impl;

import com.converter.service.UnitConversionService;

public class WeightConverter implements UnitConversionService {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        if ("kilograms".equals(fromUnit) && "grams".equals(toUnit)) {
            return value * 1000;
        } else if ("grams".equals(fromUnit) && "kilograms".equals(toUnit)) {
            return value / 1000;
        } else if ("pounds".equals(fromUnit) && "kilograms".equals(toUnit)) {
            return value * 0.453592;
        } else if ("kilograms".equals(fromUnit) && "pounds".equals(toUnit)) {
            return value / 0.453592;
        }
        throw new IllegalArgumentException("Unsupported units: " + fromUnit + " to " + toUnit);
    }
}

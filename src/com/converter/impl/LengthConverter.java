package com.converter.impl;

import com.converter.service.UnitConversionService;

public class LengthConverter implements UnitConversionService {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        if ("meters".equals(fromUnit) && "kilometers".equals(toUnit)) {
            return value / 1000;
        } else if ("kilometers".equals(fromUnit) && "meters".equals(toUnit)) {
            return value * 1000;
        }
        throw new IllegalArgumentException("Unsupported units: " + fromUnit + " to " + toUnit);
    }
}

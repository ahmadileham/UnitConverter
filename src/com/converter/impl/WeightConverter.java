package com.converter.impl;

import com.converter.service.UnitConversionService;

public class WeightConverter implements UnitConversionService {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        if ("kilogram".equals(fromUnit) && "gram".equals(toUnit)) {
            return value * 1000;
        } else if ("gram".equals(fromUnit) && "kilogram".equals(toUnit)) {
            return value / 1000;
        } else if ("pound".equals(fromUnit) && "kilogram".equals(toUnit)) {
            return value * 0.453592;
        } else if ("kilogram".equals(fromUnit) && "pound".equals(toUnit)) {
            return value / 0.453592;
        }
        throw new IllegalArgumentException("Unsupported units: " + fromUnit + " to " + toUnit);
    }
}

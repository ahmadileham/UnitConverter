package com.converter.service;

public interface UnitConversionService {
    double convert(double value, String fromUnit, String toUnit);

    // Method to specify precision
    default double convert(double value, String fromUnit, String toUnit, int precision) {
        double result = convert(value, fromUnit, toUnit);
        return Math.round(result * Math.pow(10, precision)) / Math.pow(10, precision);
    }
}

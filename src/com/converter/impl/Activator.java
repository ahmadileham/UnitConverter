package com.converter.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.converter.service.UnitConversionService;

import java.util.Dictionary;
import java.util.Hashtable;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        // Register LengthConverter
        Dictionary<String, String> lengthProps = new Hashtable<>();
        lengthProps.put("unitType", "length");
        context.registerService(UnitConversionService.class.getName(), new LengthConverter(), lengthProps);
        System.out.println("LengthConverter service registered");

        // Register WeightConverter
        Dictionary<String, String> weightProps = new Hashtable<>();
        weightProps.put("unitType", "weight");
        context.registerService(UnitConversionService.class.getName(), new WeightConverter(), weightProps);
        System.out.println("WeightConverter service registered");

        // Register TemperatureConverter
        Dictionary<String, String> tempProps = new Hashtable<>();
        tempProps.put("unitType", "temperature");
        context.registerService(UnitConversionService.class.getName(), new TemperatureConverter(), tempProps);
        System.out.println("TemperatureConverter service registered");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Converters stopped");
    }
}

package com.assignment;

public class TemperatureConverter {
    public double celsiusToFahrenheit (double celsius){
        return (celsius * 9.0 / 5.0) + 32;
    }

    public double farenheitToCelsius (double farenheit){
        return (farenheit - 32) * (5 / 9);
    }

    public double celsiusToKelvin (double celsius){
        return celsius + 273.15;
    }
}

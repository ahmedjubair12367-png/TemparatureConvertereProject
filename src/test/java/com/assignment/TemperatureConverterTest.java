package com.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {
    @Test
    public void testCelsiusToFarenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.001);
    }
    @Test
    public void testFarenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(100.0, converter.farenheitToCelsius(212.0), 0.001);
    }
    @Test
    public void testCelsiusToKelvin() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(273.15, converter.celsiusToKelvin(0.0), 0.001);
    }
}

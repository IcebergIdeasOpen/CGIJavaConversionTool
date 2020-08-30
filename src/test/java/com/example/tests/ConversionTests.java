package com.example.tests;

import com.example.TemperatureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConversionTests {
    @Test
    public void HookUp() {
        assertTrue(true);
    }
    @Test
    public void Freezing() {
        TemperatureConverter converter = new TemperatureConverter();
        int result = converter.Input(32);
        assertEquals(0, result);
    }
    @Test
    public void Boiling() {
        TemperatureConverter converter = new TemperatureConverter();
        int result = converter.Input(212);
        assertEquals(100, result);
    }
    @Test
    public void ReallyReallyCold() {
        TemperatureConverter converter = new TemperatureConverter();
        int result = converter.Input(-40);
        assertEquals(-40, result);
    }
}

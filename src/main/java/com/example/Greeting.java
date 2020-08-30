package com.example;

public class Greeting {

	private int fahrenheit;

	public int getFahrenheit() {
		TemperatureConverter converter = new TemperatureConverter();
		int celsius = converter.Input(fahrenheit);
		return celsius;
	}

	public void setFahrenheit(int fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

}

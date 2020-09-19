package com.junittesting.testing;

public class TestCalculator {

	public void testAdd() {

		Calculator calculator = new Calculator();
		
		double result = calculator.add(25,13);
		
		if (result != 39.0) {
			throw new RuntimeException("Expected 39.0; Result " + result);
		}
		
	}
}

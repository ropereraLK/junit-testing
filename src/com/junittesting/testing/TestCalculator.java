package com.junittesting.testing;

public class TestCalculator {
	private int nbErrors = 0;

	public void testAdd() {

		Calculator calculator = new Calculator();
		
		double result = calculator.add(25,13);
		
		if (result != 39.0) {
			throw new RuntimeException("Expected 39.0; Result " + result);
		}
		
	}

	public int getNbErrors() {
		return nbErrors;
	}

	public void setNbErrors(int nbErrors) {
		this.nbErrors = nbErrors;
	}

	 

 
}

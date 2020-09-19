package com.junittesting;

import com.junittesting.testing.TestCalculator;

public class JunitTesting {

	public static void main(String[] args) {
		TestCalculator test = new TestCalculator();
		
		
		try {
			test.testAdd();
		}
		catch(Throwable e){
			test.setNbErrors(test.getNbErrors()+1);
			e.printStackTrace();
			if (test.getNbErrors() > 0)
			{
			throw new RuntimeException("There were " +   test.getNbErrors()
			+ " error(s)");
			}
		}

	}

}

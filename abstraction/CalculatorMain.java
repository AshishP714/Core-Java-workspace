package com.abstraction;

public class CalculatorMain {

	public static void main(String[] args) {
		SimpleCalculator s = new SimpleCalculator();
		s.add(3, 8);
		s.divide(8, 4);
		s.multiply(3, 9);
		s.subtract(3, 2);
	}

}

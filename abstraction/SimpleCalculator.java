package com.abstraction;

public class SimpleCalculator implements Calculator {

	public void add(int a, int b) {
		System.out.println("Sum " + (a + b));
	}

	public void multiply(int a, int b) {
		System.out.println("multiply " + (a * b));
	}

	public void divide(int a, int b) {
		System.out.println(" divide " + (a / b));
	}

	public void subtract(int a, int b) {
		System.out.println("subtract " + (a - b));
	}
}

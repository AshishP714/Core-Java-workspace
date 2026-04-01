package com.abstraction;
//Calculator Interface

//Create an interface Calculator with methods:
//add()
//subtract()
//multiply()
//divide()
//Implement it in class SimpleCalculator.

public interface Calculator {
	public abstract void add(int a, int b);

	public abstract void multiply(int a, int b);

	public abstract void divide(int a, int b);

	public abstract void subtract(int a, int b);

}

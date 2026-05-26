package com.parameterizedconstructor;

public class RectangleNonParameter {
	int length;
	int width;

	RectangleNonParameter() {
		this.length = 10;
		this.width = 5;
	}

	public void displayArea() {
		System.out.println("Area of Rectangle =" + length * width);
	}
}

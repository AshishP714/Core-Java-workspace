package com.parameterizedconstructor;

public class RectanglewithParameter {
	int length;
	int width;

	RectanglewithParameter(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void displayArea() {
		System.out.println("Area of Rectangle =" + length * width);
	}
}

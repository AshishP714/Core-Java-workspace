package com.parameterizedconstructor;

//Create a class Rectangle with a parameterized constructor to set length and width, and print the area.
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

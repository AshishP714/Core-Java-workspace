package com.parameterizedconstructor;

//Create a class Rectangle with a non-parameterized constructor that sets length = 10 and width = 5. Print the area.
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

package com.abstraction;

public class Rectangle implements Shape {
	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double area() {
		return length*width;
	}
	public double perimeter() {
		return 2*length*width;
	}
}

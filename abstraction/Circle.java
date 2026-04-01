package com.abstraction;

public class Circle implements Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return 3.142 * radius*radius;
	}

	public double perimeter() {
		return 2 * 3.142 * radius*radius;
	}

}

package com.parameterizedconstructor;

//Write a program to create a class Car with:
//Non-parameterized constructor that prints “Car Started”.
//Parameterized constructor that takes model name and price.
//Create both objects.**
public class Car {
	String modelName;
	double price;

	Car() {
		System.out.println("Car is started .");
	}

	Car(String modelName, double price) {
		this.modelName = modelName;
		this.price = price;
	}

	public String toString() {
		return "Model name = " + modelName + ",Price =" + price;
	}
}

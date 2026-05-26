package com.parameterizedconstructor;

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

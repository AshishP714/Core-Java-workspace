package com.parameterizedconstructor;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("TATA", 780000.0);
		System.out.println(c2);
	}
}

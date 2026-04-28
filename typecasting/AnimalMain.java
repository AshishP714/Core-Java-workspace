package com.typecasting;

public class AnimalMain {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();
		Dog d = (Dog) a; 
		d.bark();
	}
}

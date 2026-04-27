package com.typecasting;

public class AnimalMain {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();
		// a.bark(); not allowed because here we have makes parent class refrence so
		// it only access parents class method
		// this is upacasting
		Dog d = (Dog) a; // this is downcasting in this way we can acquired
		// properties of child class own method throght parent reference
		d.bark();
	}

}

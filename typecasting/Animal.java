package com.typecasting;

//✅ Question 5: Upcasting Example
//Create:
//Class Animal → method sound()
//Class Dog extends Animal → method bark()
//In main:
//Create object using upcasting
//Animal a = new Dog();
//Call sound()
//👉 Try to call bark() and see error.
public class Animal {
	public void sound() {
		System.out.println("Animal makes sound");
	}
}

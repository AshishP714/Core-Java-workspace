package com.parameterizedconstructor;

// Write a program with a parameterized constructor to initialize id and name of a Student and display them. 
public class Student2 {
	int id;
	String name;

	Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("Student id =" + id);
		System.out.println("Student name =" + name);
	}

	@Override
	//@Override prevent error
	public String toString() {
		return "Student id =" + id + ",Student name =" + name;
	}
}

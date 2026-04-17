package com.parameterizedconstructor;

//Create a class Employee with a parameterized constructor that accepts id, name, and salary.
public class Employee {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Emplyoee Id = " + id + ",Name = " + name + ",Salary =" + salary;
	}
}

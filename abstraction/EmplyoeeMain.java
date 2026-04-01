package com.abstraction;

public class EmplyoeeMain {

	public static void main(String[] args) {
		Emplyoee e1;
		e1 = new FullTimeEmployee(700);
		e1.calculateSalary();
		e1 = new partTimeEmployee(100, 4);
		e1.calculateSalary();

	}

}

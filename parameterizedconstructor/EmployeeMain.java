package com.parameterizedconstructor;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee(3, "Shubham", 35000.0);
		System.out.println(e1);
		Employee e2 = new Employee(9, "Nikhil", 3800.0);
		System.out.println(e2);
		boolean a = e2.equals(e1);
		System.out.println(a);
	}
}

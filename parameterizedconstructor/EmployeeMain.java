package com.parameterizedconstructor;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee(3, "rakesh", 34000.0);
		System.out.println(e1);
		Employee e2 = new Employee(9, "raju", 3700.0);
		System.out.println(e2);
		boolean a = e2.equals(e1);// check contain
		System.out.println(a);
	}
}
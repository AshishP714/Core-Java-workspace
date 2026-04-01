package com.abstraction;

public class partTimeEmployee implements Emplyoee {
	double salaryPerHour;
	double totalHour;

	partTimeEmployee(double salaryPerHour, double totalHour) {
		this.salaryPerHour = salaryPerHour;
		this.totalHour = totalHour;
	}

	@Override
	public double calculateSalary() {
		double salary = salaryPerHour * totalHour;
		System.out.println("part time emplyoee salary " + salary);
		return salary;
	}
}

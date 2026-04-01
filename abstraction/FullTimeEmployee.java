package com.abstraction;

public class FullTimeEmployee implements Emplyoee {
	double amount;

	FullTimeEmployee(double amount) {
		this.amount = amount;
	}

	@Override
	public double calculateSalary() {
		System.out.println("Full time Emplyoee salary per day =" + amount);
		return amount;

	}

}

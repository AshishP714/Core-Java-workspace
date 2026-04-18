package com.practice5feb;

public class Manger extends Company {
	String mangerName;
	double salary;

	Manger(String companyName, String location, int totalNumberEmployees, String mangerName, double salary) {
		this.companyName = companyName;
		this.location = location;
		this.totalNumberEmployees = totalNumberEmployees;
		this.mangerName = mangerName;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Company name is " + companyName);
		System.out.println("Company location is " + location);
		System.out.println("Total number of emplyoees" + totalNumberEmployees);
		System.out.println("Manger name is " + mangerName);
		System.out.println("salary " + salary);
	}

}

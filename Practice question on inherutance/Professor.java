package com.practice5feb;

public class Professor extends University {
	String department;
	String qualification;

	Professor(String uniName, String location, String department, String qualification) {
		this.uniName = uniName;
		this.location = location;
		this.department = department;
		this.qualification = qualification;
	}

	public void professorInfo() {
		System.out.println("Univesity name =" + uniName);
		System.out.println("University location =" + location);
		System.out.println("Department =" + department);
		System.out.println("Professor qualification =" + qualification);

	}
}

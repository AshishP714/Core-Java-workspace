package com.practice5feb;

public class Student extends University {
	String studentName;
	int studentId;

	Student(String uniName, String location, String studentName, int studentId) {
		this.uniName = uniName;
		this.location = location;
		this.studentName = studentName;
		this.studentId = studentId;

	}

	public void studentInfo() {
		System.out.println("University name =" + uniName);
		System.out.println("University location =" + location);
		System.out.println("Student name =" + studentName);
		System.out.println("Student Id =" + studentId);
	}
}

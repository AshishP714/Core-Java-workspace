package com.statickeyword;

public class Student {
	String name;
	int marks;
	static int passingMarks;
	static int totalStudents = 0;
	{
		passingMarks = 35;
	}
	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
		totalStudents++;
	}
	public void display() {
		System.out.println("Student name =" + name + " , " + "marks =" + marks);
	}

	public static void main(String[] args) {
		Student s = new Student("Payal", 89);
		System.out.println("Passing marks =" + Student.passingMarks);// this are static member without object we can
																		// call it
		s.display();
		Student s1 = new Student("Priya", 78);
		s1.display();
		System.out.println("Total student =" + Student.totalStudents);
	}
}

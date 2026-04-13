package com.statickeyword;

//🔹 Question 2 – School Exam System 🏫
//Create a class Student:
//name
//marks
//passingMarks (same for all students)
//totalStudents (count total objects)
//Print passing marks and total students.
public class Student {
	// variables non static and static
	String name;
	int marks;
	static int passingMarks;
	static int totalStudents = 0;
//non static block
	{
		passingMarks = 35;
	}

//constructor
	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
		totalStudents++;
	}

	// non static method
	public void display() {
		System.out.println("Student name =" + name + " , " + "marks =" + marks);
		// System.out.println("Passing marks =" + passingMarks);
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

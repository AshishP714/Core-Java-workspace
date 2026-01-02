package Polymorphism;

public class Student {

	public String student_name;
	public int student_id;
	public long student_phone;

	public Student(String student_name) {
		this.student_name = student_name;
	}

	public Student(int student_id, long student_phone) {		// Constructor overloading.
		this.student_id = student_id;
		this.student_phone = student_phone;
	}

	public void display() {
		System.out.println("Student name:- " + student_name);
		System.out.println("Student id:- " + student_id);
		System.out.println("Student phone no:- " + student_phone);
	}
}

package com.practice5feb;

import java.util.Scanner;

public class UniversityMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter university name ");
		String uniName = sc.nextLine();
		System.out.println("Enter university location ");
		String uniLocation = sc.nextLine();
		System.out.println("Enter Student name");
		String stuName = sc.nextLine();
		System.out.println("Enter Student Id ");
		int stuId = sc.nextInt();
		sc.nextLine();// clear buffering
		System.out.println("Enter Department of Professor");
		String department = sc.nextLine();
		System.out.println("Enter qualification of professor");
		String qualification = sc.nextLine();
		System.out.println("Enter number staff ");
		int numStaff = sc.nextInt();
		// Student child object creation
		Student s1 = new Student(uniName, uniLocation, stuName, stuId);
		s1.studentInfo();
		// Professor child class object creation
		Professor p1 = new Professor(uniName, uniLocation, department, qualification);
		p1.professorInfo();
		// staff child class object creation
		Staff sta1 = new Staff(uniName, uniLocation, numStaff);
		sta1.staffInfo();
		sc.close();
	}

}

package com.practice5feb;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter company name is ");
		String nameCom = sc.nextLine();
		System.out.println("Enter company location is ");
		String location = sc.nextLine();
		System.out.println("Enter total number emplyoees");
		int totalnumEmp = sc.nextInt();
		sc.nextLine();// clear buffer
		System.out.println("Enter manger name");
		String nameManger = sc.nextLine();
		System.out.println("Enter manger salary");
		double salary = sc.nextDouble();
		Manger m1 = new Manger(nameCom, location, totalnumEmp, nameManger, salary);
		m1.display();
	}

}

package com.practice5feb;

import java.util.Scanner;

public class InsuranceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter policy number");
		String numberPolicy = sc.nextLine();
		System.out.println("Enter Policy holder name");
		String name = sc.nextLine();
		System.out.println("Enter covrage amount");
		double amount = sc.nextDouble();
		System.out.println("Enter number of family memeber");
		int numberOfFamily = sc.nextInt();
		sc.nextLine();// clear the buffer
		System.out.println("Enter family doctor name ");
		String nameDoctor = sc.nextLine();

		FamilyHealthPlan f1 = new FamilyHealthPlan(numberPolicy, name, amount, numberOfFamily, nameDoctor);
		f1.display();
		sc.close();
	}

}

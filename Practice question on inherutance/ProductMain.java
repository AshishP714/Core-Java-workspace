package com.practice5feb;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter brand");
		m1.brand = sc.nextLine();
		System.out.println("Enter Mobile Color color");
		m1.color = sc.next();
		System.out.println(" Enter Product id");
		m1.productID = sc.nextInt();
		System.out.println("Enter product name");
		m1.productName = sc.next();
		System.out.println("Enter Warranty");
		m1.warranty = sc.nextInt();
		m1.display();
		m1.productDetail();
		m1.show();
		sc.close();
	}

}

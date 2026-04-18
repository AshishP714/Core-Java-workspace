package com.practice5feb;

//3️⃣ E-Commerce Product System
//Write a Multilevel Inheritance program for
//Product → ElectronicProduct → Mobile.
public class Product {
	int productID;
	String productName;

	public void display() {
		System.out.println("Product ID =" + productID);
		System.out.println("Product Name =" + productName);
	}
}

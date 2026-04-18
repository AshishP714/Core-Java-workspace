package com.practice5feb;

public class Book extends Section {
	String color;
	String title;
	double price;

	Book(String libName, String location, char section, String color, String title, double price) {
		this.libName = libName;
		this.location = location;
		this.section = section;
		this.color = color;
		this.title = title;
		this.price = price;

	}

	public void display() {
		System.out.println("Library name =" + libName);
		System.out.println("Library location =" + location);
		System.out.println("Section =" + section);
		System.out.println("Book color =" + color);
		System.out.println("Book title =" + title);
		System.out.println("Book price =" + price);

	}

}

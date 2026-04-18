package com.practice5feb;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter library name");
		String libName = sc.nextLine();
		System.out.println("Enter library location");
		String location = sc.nextLine();
		System.out.println("Enter section");
		char section = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter book color");
		String color = sc.nextLine();
		System.out.println("Enter book title");
		String title = sc.nextLine();
		System.out.println("Enter book price");
		double price = sc.nextDouble();
		Book b1 = new Book(libName, location, section, color, title, price);
		b1.display();
		sc.close();
	}

}

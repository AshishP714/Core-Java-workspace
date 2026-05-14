package com.Scanner;

import java.util.Scanner;

// Take a sentence from user using nextLine() and print it.
public class Sentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String a = sc.nextLine();
		System.out.println("Sentence =" + a);
		sc.close();
	}

}

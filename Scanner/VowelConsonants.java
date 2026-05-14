package com.Scanner;

import java.util.Scanner;

//Take a character from user and check whether it is vowel or consonant.
public class VowelConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charcter");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
			System.out.println(ch + " is vowel ");
		} else {
			System.out.println(ch + " is Consonant ");
		}
		sc.close();
	}

}

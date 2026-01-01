/*
Write a program to  accept user's information and print report of that information.
The report contains: no of words, no of characters, no of consonants, no of vowels, no of capital letters, no of lower case characters, no of symbols and no of digits.
*/

import java.util.Scanner;

public class Information {

	private void userInformation(String name, String address, String email) {
		int count = 0, capital=0, vowels=0, word=0, lowercase=0;
		
		for (int i = 0; i < name.length(); i++) {
			count++;
		}
		for (int i = 0; i < address.length(); i++) {
			count++;
		}
		for (int i = 0; i < email.length(); i++) {
			count++;
		}
		System.out.println(count);
	}
	
	private void reporDisplay() {

	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name=scanner.nextLine();
		System.out.println("Enter address : ");
		String address=scanner.nextLine();
		System.out.println("Enter email id : ");
		String email=scanner.nextLine();
		
		Information information = new Information();
		information.userInformation(name, address, email);
		
		scanner.close();
	}
}


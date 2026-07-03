package IRBIS_Technologies;

import java.util.Scanner;

public class ReverceString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse: ");
		String str = scanner.nextLine();
		
		String reversedStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}
		
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reversedStr);
	}
}
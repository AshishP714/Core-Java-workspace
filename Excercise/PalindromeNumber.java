package com.practice28feb;
//Check Palindrome String

//Input: "madam"
//Output: "Palindrome"
//(Use if-else and loop)

public class PalindromeNumber {

	public static void main(String[] args) {
		String input = "madam";
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			output = output + ch;
		}
		// System.out.println(output);
		if (output.equals(input) == true) {
			System.out.println(input + " Is palindrome ");
		} else {
			System.out.println(input + " Is not palindrome ");
		}

	}

}

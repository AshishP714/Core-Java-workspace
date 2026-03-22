package CorePractice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChake {

	public boolean isAnagram(String s1, String s2) {

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() != s2.length()) {
			return false;
		}
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);

		return Arrays.equals(array1, array2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word :- ");
		String s1 = sc.next();

		System.out.println("Enter second word :- ");
		String s2 = sc.next();

		AnagramChake a = new AnagramChake();

		boolean result = a.isAnagram(s1, s2);

		System.out.println("Strings are anagram -> " + result);
	}
}
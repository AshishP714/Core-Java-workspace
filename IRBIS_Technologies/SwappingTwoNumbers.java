package IRBIS_Technologies;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int b = scanner.nextInt();

		System.out.println("Before swapping: a = " + a + ", b = " + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}

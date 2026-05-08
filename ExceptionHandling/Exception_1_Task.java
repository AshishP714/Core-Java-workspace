package ExceptionHandling;

import java.util.Scanner;

public class Exception_1_Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the number : ");
			int num = scanner.nextInt();
			System.out.print("Cube of " + num);
			int cube = num * num * num;
			System.out.print(" -> " + cube);	
		} catch (Exception e) {
			System.out.println("Error: You are entering wrong value");
		}
		System.out.println("\nProgram will be terminated...");
		scanner.close();
	}
}

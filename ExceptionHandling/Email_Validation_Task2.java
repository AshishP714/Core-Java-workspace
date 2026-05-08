package ExceptionHandling;

import java.util.Scanner;

public class Email_Validation_Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Email : ");
		String email = scanner.next();
		scanner.close();
		try {	
			if (email.contains("@")) {
				System.out.println("Domain name : "+email.substring(email.indexOf("@") + 1));
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			
			System.out.println("Error : Invalid email...");
		}
		System.out.println("Programm will be terminated...");
	}
}

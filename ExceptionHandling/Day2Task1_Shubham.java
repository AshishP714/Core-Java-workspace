package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day2Task1_Shubham {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			System.out.println(num*num*num);
		} catch (InputMismatchException e) {
			System.out.println("invalid input please enter only digits");
		}
 
		sc.close();
	}
}
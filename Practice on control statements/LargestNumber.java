
//write a program to accept three number and find largest number
import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		System.out.println("Enter b number");
		int b = sc.nextInt();
		System.out.println("Enter c number");
		int c = sc.nextInt();
		if (a > b) {
			System.out.println("a is largest");
		} else if (b > c) {
			System.out.println("b is largest");
		} else {
			System.out.println("c  is largest");
		}
		sc.close();

	}

}

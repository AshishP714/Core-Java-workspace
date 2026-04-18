
//write a program to accept a number and find it zero ,positive or negative
import java.util.Scanner;
public class PosNegZer0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("zero");
		}
		sc.close();
	}

}

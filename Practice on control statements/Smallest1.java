
//write a java program to accept two number and find smallest
import java.util.Scanner;

public class Smallest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter b number");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("b is smallest ");
		} else {
			System.out.println("a is smallest");
		}
		sc.close();
	}

}

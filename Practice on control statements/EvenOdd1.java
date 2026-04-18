//write a java program to accept a number and find it is even or odd
import java.util.Scanner;
public class EvenOdd1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner ( System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("It is a Even number");	
		}else {
			System.out.println("it is a odd number");
		}
		sc.close();
	}

}

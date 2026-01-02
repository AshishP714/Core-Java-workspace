package Pyramid_Printing;

import java.util.Scanner;

public class Shape3 {

	public static void main(String[] args) {
		
		int n,i,j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows:- ");
		n = scanner.nextInt();
		for( ; n >=1; n--) {
			for(i=1; i<=5; i++) {
				System.out.print(i);
			}
			System.out.println(n);
		}
	}
}

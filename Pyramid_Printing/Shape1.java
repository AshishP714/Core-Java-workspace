package Pyramid_Printing;

import java.util.*;
public class Shape1 {

	public static void main(String[] args) {
		
		int n,i,j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows:- ");
		n = scanner.nextInt();
		for (i=1; i<=n; i++) {
			for (j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

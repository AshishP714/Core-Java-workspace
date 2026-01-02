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

/* 
   * output
 * Enter number of rows:- 
	5
	*
	**
	***
	****
	*****
 * 
 * i+j output
 * 	Enter number of rows:- 
	5
	2
	34
	456
	5678
	678910

 *  i output 
 * Enter number of rows:- 
	5
	1
	22
	333
	4444
	55555 
  
 *  j output
 *  Enter number of rows:- 
	5
	1
	12
	123
	1234
	12345
 */



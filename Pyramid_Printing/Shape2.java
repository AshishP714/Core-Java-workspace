package Pyramid_Printing;

import java.util.*;

public class Shape2 {

	public static void main(String[] args) {

		int i,j,k=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of rows:- ");
		i = scanner.nextInt();
		for (; i >= 0; i--) {
			for (j=1; j <= i; j++) {
				System.out.print(k);
			}
			k=k+1;
			System.out.println();
		}
	}
}

/*	
 * "*" Enter the no of rows:- 
	5
	*****
	****
	***
	**
	*
	
	
	"j" Enter the no of rows:- 
	5
	12345
	1234
	123
	12
	1
	
	"k" Enter the no of rows:- 
	5
	11111
	2222
	333
	44
	5
*/
 
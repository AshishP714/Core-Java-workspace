package Practice;

import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter array element :- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even number is : " +arr[i]);
			}
		}
	}
}

package Practice;

import java.util.Scanner;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.println("Enter array element :- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {	
			if(small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println(small);
	}
}
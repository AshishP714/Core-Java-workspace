package Practice;

import java.util.Scanner;

public class ArrayDivisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter array element :- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}

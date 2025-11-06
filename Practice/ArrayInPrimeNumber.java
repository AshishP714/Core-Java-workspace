package Practice;

import java.util.Scanner;

public class ArrayInPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isItPrime = true;
		int arr[] = new int[3];
		System.out.println("Enter array element :- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 1) {
				isItPrime = false;
			} else {
				for (int j = 2; j < arr.length / 2; j++) {
					if (arr[i] % j == 0) {
						isItPrime = false;
						break;
					}
				}
			}
			if (isItPrime) {
				System.out.println(arr[i] + " The numbar is prime");
			} else {
				System.out.println(arr[i] + " The number is not Prime");
			}
		}
	}
}

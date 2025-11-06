package Practice;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter array element :- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		
		System.out.println("Addition : " +sum);
	}
}

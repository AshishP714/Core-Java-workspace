package Practice;

import java.util.Scanner;

public class ArrayInAscending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter array element :- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < arr.length; i++) {
			 for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending order : ");
		for(int num : arr) {
			System.out.println(num);
		}
	}
}
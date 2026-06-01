package Array;

import java.util.Scanner;

public class CountElementsInArray {
	public int countElement(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter array element :- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int result = new CountElementsInArray().countElement(arr);
		System.out.println(result);
	}
}

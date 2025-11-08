package Practice;

import java.util.Scanner;

public class FriquencyOfEachElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the element in array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					count++;
				}
			}
			System.out.println("Element "+arr[i] + " Occrres " +count+" times");
		}
	}
}

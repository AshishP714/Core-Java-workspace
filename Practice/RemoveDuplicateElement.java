package Practice;

import java.util.Scanner;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array element : ");
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int newArray = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				arr[newArray] = arr[i];
				newArray++;
			}
		}
		System.out.println("Array element after removing duplicate : ");
		for (int i = 0; i < newArray; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
package Practice;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element in array : ");
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element you want to search : ");
		int search = sc.nextInt();
		int count = 0;
		int ele = 0;
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				System.out.println("Element "+arr[i]+" founded on "+count+" index");
			} 
			else {
				ele++;
			}
		count++;
		}
		if (count == ele) {
			System.out.println("Not found ");
		} 
	}
}
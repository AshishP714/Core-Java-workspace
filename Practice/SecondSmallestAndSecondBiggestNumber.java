package Practice;

import java.util.Scanner;

public class SecondSmallestAndSecondBiggestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int max = 0;
		int min = arr[0];
		int smax = 0;
		System.out.println("Enter array element : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} 
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		int smin = max;
		for (int i = 0; i < arr.length; i++) {
			if (smax < arr[i] && arr[i] != max) {
				smax = arr[i];
			}
			if (smin > arr[i] && arr[i] != min) {
				smin = arr[i];
			}
		}
		System.out.println(smax + " is a second largest number : ");
		System.out.println(smin + " is a second smallest number : ");
	}
}
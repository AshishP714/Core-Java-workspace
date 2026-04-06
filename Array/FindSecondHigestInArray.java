package Array;

public class FindSecondHigestInArray {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 5, 6, 67, 88 };
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		int secondHigest = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max) {
				secondHigest = arr[i];
			}
		}
		
		System.out.println(secondHigest);
	}
}
package IRBIS_Technologies;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int[] array = { 5, 12, 7, 3, 9 };
		int largest = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}

		System.out.println("The largest element in the array is: " + largest);
	}
}
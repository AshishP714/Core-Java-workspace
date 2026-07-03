package IRBIS_Technologies;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		int[] array = { 5, 12, 7, 3, 9 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} 
			else if (array[i] > secondLargest && array[i] != largest) {
				secondLargest = array[i];
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element in the array.");
		} else {
			System.out.println("The second largest element in the array is: " + secondLargest);
		}
	}
}
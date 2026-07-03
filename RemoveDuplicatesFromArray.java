package IRBIS_Technologies;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		int[] array = { 5, 12, 7, 3, 9, 5, 12, 7 };
		int n = array.length;

		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int k = 0; k < j; k++) {
				if (array[i] == temp[k]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				temp[j++] = array[i];
			}
		}

		System.out.print("Array after removing duplicates: ");
		for (int i = 0; i < j; i++) {
			System.out.print(temp[i] + " ");
		}
	}
}
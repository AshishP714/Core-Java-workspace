package Array;

public class ReverceArray {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10 };
		int rev[] = new int[arr.length];

		for (int i = arr.length - 1; i < 0; i--) {
			rev[i] += arr[i];
		}

		for (int i = 0; i < rev.length; i++) {
			System.out.print(rev[i]);
		}
	}
}
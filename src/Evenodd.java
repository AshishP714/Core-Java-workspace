//print even numbers from 1 to 100 but stop when you get first odd number.
public class Evenodd {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				break;
			}
			System.out.println(i);// value here never check because 1 is odd so, it stop the loop.

		}
	}

}

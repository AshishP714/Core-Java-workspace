//print the number from 1 to 100 but skip number ending with digit 5.
public class Digit {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

}

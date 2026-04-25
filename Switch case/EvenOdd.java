package switchcase;

// Use a switch statement to check if a number is even or odd (hint: use number % 2 as the expression)
public class EvenOdd {

	public static void main(String[] args) {
		int num = 2;
		switch (num % 2) {
		case 0:
			System.out.println("Even number");
			break;
		case 1:
			System.out.println("Odd number");
			break;
		}

	}

}

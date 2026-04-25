//1. Write a Java program that takes an integer (1to7) and prints the corresponding day name (e.g., 1 at Monday)
package switchcase;

public class Weekend {

	public static void main(String[] args) {
		int num = 1;
		switch (num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default: {
			System.out.println("invalid input");
		}
		}
	}

}

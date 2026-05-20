package switchcase;

// Take month number (1â€“12) and print the corresponding season:
public class Season {

	public static void main(String[] args) {
		int month = 24;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("Winter Season");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Summer Season");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Monsoon Season");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Autumn Season");
			break;
		default: {
			System.out.println("invalid input");
		}

		}

	}

}

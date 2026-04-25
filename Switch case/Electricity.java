package switchcase;
// Accept a category type (Domestic, Commercial, Industrial) and print the electricity rate per unit using a switch case.

public class Electricity {

	public static void main(String[] args) {
		String category = "Domestic";
		switch (category) {
		case "Domestic":
			System.out.println("Electricity rate= 2 Rs per unit");
			break;
		case "Commercial":
			System.out.println("Electricity rate= 4 Rs per unit");
			break;
		case "industrial":
			System.out.println("Electricity rate= 8 Rs per unit");
			break;
		default: {
			System.out.println("invalid input");
		}
		}

	}

}

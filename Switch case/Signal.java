//Input color name (Red, Yellow, or Green) and print the appropriate action:

package switchcase;
public class Signal {

	public static void main(String[] args) {
		String color = "Green";
		switch (color) {
		case "Red":
			System.out.println("Stop");
			break;
		case "Green":
			System.out.println("Go");
			break;
		case "Yellow":
			System.out.println(" ready");
			break;
		default:
			System.out.println("invalid input");
		}

	}

}

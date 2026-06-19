package Exercise;

public class SmallestTernaryOperator2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 40;
		int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
		System.out.println(min);
	}
}

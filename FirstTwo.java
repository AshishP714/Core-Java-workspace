
public class FirstTwo {

	public String firstTwo(String str) {

		return str.substring(0, 2);
	}

	public static void main(String[] args) {

		FirstTwo two = new FirstTwo();
		System.out.println(two.firstTwo("Hello"));
		System.out.println(two.firstTwo("abcdefg"));
		System.out.println(two.firstTwo("ab"));
		System.out.println(two.firstTwo("Tushar"));
	}
}

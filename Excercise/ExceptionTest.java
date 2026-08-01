package CorePractice;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			System.out.println("A");
			int sum = 10 / 0;
			System.out.println("B");
		} catch (ArithmeticException exception) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
		
		System.out.println("E");
		int addition = 10 + 20;
		System.out.println("The addition of :- "+ addition);
	}
}

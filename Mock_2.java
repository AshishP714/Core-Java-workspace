import java.util.Scanner;

public class Mock_2 {

	Scanner scanner = new Scanner(System.in);

	public void Pattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void Pattern(int x) {
		System.out.println("Enter number: ");
		x = scanner.nextInt();
		
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}

			System.out.println();
		}
	}

	public void Pattern(int x, char a) {
		System.out.println("Enter number: ");
		x = scanner.nextInt();
		System.out.println("Enter Character: ");
		a = scanner.next().charAt(0);
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println(a);
		}
	}

	public static void main(String[] args) {

		Mock_2 mock = new Mock_2();
		mock.Pattern();
		mock.Pattern(0);
		mock.Pattern(0, 'a');
	}
}

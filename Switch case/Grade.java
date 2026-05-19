package switchcase;

public class Grade {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("Range----> 85 to 100----->Excellent");
			break;
		case 'B':
			System.out.println("Range----> 70 to 85----->Good");
			break;
		case 'C':
			System.out.println("Range----> 50 to 70---->Average");
			break;
		case 'D':
			System.out.println("Range----> 35 to 50------>poor");
			break;
		case 'F':
			System.out.println("fail ------>better next time ");
			break;

		default: {
			System.out.println("invalid input");
		}

		}
	}
}

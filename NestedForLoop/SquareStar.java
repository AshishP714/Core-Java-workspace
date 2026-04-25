//* * * *
//* * * *
//* * * *
//* * * *
public class SquareStar {
	public static void main(String args[]) {
		for (int i = 1; i <= 4; i++) {// they are 4 rows so i<=4 this provide rows
			for (int j = 1; j <= 4; j++) { // this provide us column
				System.out.print("* ");// this will print start in one line , you can adjust space of star here
			}
			System.out.println(" ");// after iteration of j fully it changes line this again happen till i become
									// false

		}
	}
}

/*3. WAP to accept names of 10 fruits of your choice. Print only those fruit names which starts with either 'P' or has 'M' 
 in it and no of vowels in the fruit name is more than two.
 */

import java.util.Scanner;

public class Fruits {

	public static void main(String[] args) {
		int vowels = 0;
		String Fruit[] = new String[10];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the fruit name : ");
		for (int i = 0; i < Fruit.length; i++) {
			Fruit[i] = scanner.nextLine();
		}

		for (int i = 0; i < Fruit.length; i++) {
			if (Fruit[i].contains("P") || (Fruit[i].contains("M"))) {
				System.out.println(Fruit[i]);
				if (Fruit[i] == ("a") || (Fruit[i] == ("e")) || (Fruit[i] == ("i")) || (Fruit[i] == ("o"))
						|| (Fruit[i] == ("u"))) {
					vowels++;
					if (vowels == 2) {
						System.out.println(Fruit[i]);
					}

				}

			}

		}
		scanner.close();
	}
}

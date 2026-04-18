
//write a java program to count vowel 
import java.util.Scanner;

public class VowelCount1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "goodmorning";
		int length = name.length();

		 System.out.println("length of string ="+length);
		int count = 0;
		for (int i = 0; i < length; i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				// System.out.println("vowel");
				count++;
			}
			// System.out.println(count);
		}
		System.out.println("count of vowel are ="+count);
		sc.close();
	}

}

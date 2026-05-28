package comm.pracctice;

//3. Count Vowels and Consonants
//
//Input: "Hello World"
public class CountVowelConsonants {
	public static void main(String[] args) {
		String str = "Hello world";
		int vowel = 0;
		int consonants = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					vowel++;
				} else {
					consonants++;
				}
			}

		}
		System.out.println("Vowel =" + vowel);
		System.out.println("Consonants =" + consonants);
	}
}

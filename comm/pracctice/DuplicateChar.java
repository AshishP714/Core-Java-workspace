package comm.pracctice;

//9. Find Duplicate Characters in String
//
//Input: "programming"
//
//Output example=r,g,m
public class DuplicateChar {
	public static void main(String[] args) {
		String input = "programming";
		for (int i = 0; i <= input.length() - 1; i++) {
			int count = 0;
			char ch1 = input.charAt(i);

			for (int j = i + 1; j <= input.length() - 1; j++) {
				char ch2 = input.charAt(j);
				if (ch1 == ch2) {
					count++;
				}

			}
			if (count > 0) {
				System.out.println(ch1 + ",");
			}

		}
	}
}

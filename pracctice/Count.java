package comm.pracctice;

//4. Count Number of Words in String
//
//Input: "Java is very easy"
//
//Output: 4
public class Count {

	public static void main(String[] args) {
		String str = "Java is Very Easy";
		int count = 1;
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				count++;
			}

		}
		System.out.println("count  = " + count);
	}

}

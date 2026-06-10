package comm.pracctice;

public class CountChar {
	public static void main(String[] args) {
		String input = "programming";
		int count = 0;
		for (int i = 0; i <= input.length() - 1; i++) {
			char ch = input.charAt(i);
			if (ch == 'g') {
				count++;
			}
		}
		System.out.println(count);
	}
}

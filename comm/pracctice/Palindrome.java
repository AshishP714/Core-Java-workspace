package comm.pracctice;

public class Palindrome {
	
	public static void main(String[] args) {
		String str1 = "madam";
		String str2 = "hello";
		String ts = "";
		String ts2=ts;
		for (int i = str1.length() - 1; i >= 0; i--) {
			char ch = str1.charAt(i);
			ts = ts + ch;
		}
		if (ts.equals(str1)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome number");
		}
		for (int i = str2.length() - 1; i >= 0; i--) {
			char ch = str2.charAt(i);
			ts2 = ts2 + ch;
		}
		if(ts2.equals(str2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
}

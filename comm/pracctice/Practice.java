package comm.pracctice;

import java.util.Scanner;

//6. Check if String Contains Only Digits
//
//Input: "12345" → True
//Input: "123a5" → False
public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a = sc.nextLine();
		int count = 0;
		boolean isDigit = true;
		for (int i = 0; i <= a.length() - 1; i++) {
			char ch = a.charAt(i);
			if (ch >= '0' && ch <= '9') {
               count++;
				
			}
		}
		if(count==a.length()) {
			isDigit=true;
		}else {
			isDigit=false;
		}
		System.out.println(isDigit);
	}
}
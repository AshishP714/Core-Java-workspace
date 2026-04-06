package com.stringpractice;

//First Non-Repeating Character
//
//👉 Input: "aabbcdde"
//👉 Output: c
public class Practice2403 {
	public static void main(String[] args) {

		String str = "aabbcdde";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}

			}
			if (count == 1) {
				System.out.println(ch);
				break;
			}
		}
	}
}
/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". 
Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
*/
package CodingBat;

public class StringLength {

	private String makeOutWord(String out, String word) {

		return out.substring(0,2).concat(word)+out.substring(2);
	}
	
	public static void main(String[] args) {
		
		StringLength length = new StringLength();
		System.out.println(length.makeOutWord("<<>>", "Yay"));
		System.out.println(length.makeOutWord("<<>>", "WooHoo"));
		System.out.println(length.makeOutWord("[[]]", "word"));
	}
}

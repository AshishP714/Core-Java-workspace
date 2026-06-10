package comm.pracctice;
//1. Reverse a String
//
//Input: "hello"
//Output: "olleh"
public class Revese {
public static void main(String[] args) {
	String str="hello";
	String str2="";
	for(int i=str.length()-1;i>=0;i--) {
		char ch=str.charAt(i);
		str2=str2+ch;
		
	}
	System.out.println(str2);
}
}

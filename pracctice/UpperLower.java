package comm.pracctice;
//8. Convert Uppercase to Lowercase Without Built-in Method
//Input: "HELLO"
//Output: "hello"
public class UpperLower {
public static void main(String[] args) {
	String str="HELLO";
	String str1="";
	for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		if(ch>='A'&&ch<='Z') {
			str1=str1+(char)(ch+32);
		}else {
			str1=str1+(char)(ch+32);
		}
	
		
	}
	System.out.println(str1);
	
}
}

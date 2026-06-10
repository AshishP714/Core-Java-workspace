package comm.pracctice;
//5. Remove Spaces from String
//
//Input: "Hello World Java"
//
//Output: "HelloWorldJava"
public class RemoveSpace {

	public static void main(String[] args) {
		//using method
		String str="Hello world java";
		String str1=str.replaceAll(" ", "");
		System.out.println(str1);
		//without using method
				String ts="";
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				ts=ts+ch;
			}
			
		}
		System.out.println(ts);

	}

}

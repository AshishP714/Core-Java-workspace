package comm.pracctice;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String str="Hello world java";
		String str1=str.replaceAll(" ", "");
		System.out.println(str1);
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

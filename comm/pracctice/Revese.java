package comm.pracctice;

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

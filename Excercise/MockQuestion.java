
public class MockQuestion {

	

	public static void main(String[] args) {
		String str="Payalpatil";
		int tv=0;
		for(int i=0;i<=str.length()-1;i++) {
			
			for(int j=0;j<=i && tv<str.length();j++) {
			//System.out.print(ch);
			
				System.out.print(str.charAt(tv));
				tv++;
			}
			System.out.println();
			
			
		}
	}

}

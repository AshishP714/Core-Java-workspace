public class MockQuestion {
	public static void main(String[] args) {
		String str="AshishPardeshi";
		int telivision=0;
		for(int i=0;i<=str.length()-1;i++) {
			
			for(int j=0;j<=i && telivision<str.length();j++) {
			
				System.out.print(str.charAt(telivision));
				telivision++;
			}
			System.out.println();		
		}
	}
}

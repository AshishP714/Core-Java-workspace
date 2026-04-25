//  *
//   * *
//  * * *
// * * * *
//* * * * *



public class SymmtericPyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {//row//i=1
			for(int s=1;s<=n-i;s++) {//this loop is for space//1<=4 true condition print space again it check for
	//s=2,s=3,s=4 till condition become false after when s=5 condition become false so 4 space will print			
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {//here * print till condition become false
				System.out.print("* ");
			}
			System.out.println("");//changes line
		}

	}

}

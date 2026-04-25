//  *
//   * *
//  * * *
//   * *
//    *
public class Diamond {

	public static void main(String[] args) {
		int n=3;
		//top part
		for(int i=1;i<=n;i++) {//i=1
			for(int s=1;s<=n-i;s++) {//condition check 1<=2,2<=2,3<=2=false it give 2 space
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) {//condition will check for i=1 ,j=1,2,3...1<=1=true,2<=1=false 
				System.out.print("* ");// in first iteration 1 print *
			}
			System.out.println(" ");//changes line this pattern again happen till i<=n condition become false
		}
		//bottom part
		for(int i=n-1;i>=1;i--) {//i=2,i=1
			for(int s=1;s<=n-i;s++) {//1<=2=true,2<=2=true,two space
				System.out.print(" ");//__ two space 
			}
			for(int j=1;j<=i;j++) {//2 * will print 
				System.out.print("* ");	
			}
			System.out.println("");
		}

	}

}

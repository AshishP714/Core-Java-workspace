//print fibonacci series from 1 to 50 
public class Practice {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a);//0
		System.out.println(b);//1
		for( int i=1;i<=48;i++) {
			int c=a+b;//c=0+1=1,1+1=2
			a=b;//a=1 ,b=1  a=1,b=2
			b=c;
			System.out.println(c);//1//2
		}
		
	}
}

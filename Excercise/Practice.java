//1>
public class Practice {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a);//0
		System.out.println(b);//1
		for( int i=1;i<=48;i++) {
			int c=a+b;//c=1
			a=b;//a=1 ,b=1
			b=c;
			System.out.println(c);
		}
		
	}
}



//1234------4321
public class Prtactice1 {

	public static void main(String[] args) {
		int a = 1234;
		int rev = 0;
		while (a > 0) {// a=1234,a=123,a=12,a=1,a=0--false
			int digit = a % 10;// 4//3//2//1
			rev = rev * 10 + digit;// 4//43//432//4321
			a = a / 10;// 123//12//1//0
			// System.out.println(rev);//4,43,432,4321

		}
		System.out.println(rev);// 4321

	}

}



//print prime number from 1 to 50
public class Practice3 {

	public static void main(String[] args) {
		int num = 10;// 10
		int count = 0;
		for (int i = 1; i <= num; i++) {// 1<=10
			if (num % i == 0) {// 0,0,1,2,0,4,3,2,1,0 3 count
				count++;
			}

		}
		if (count == 2) {// count==3--false
			System.out.println("prime number");
		} else {
			System.out.println("is not prime number");// else block will printct
		}

	}

}











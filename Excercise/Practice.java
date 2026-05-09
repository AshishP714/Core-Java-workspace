//1>
public class Practice {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for( int i=1;i<=48;i++) {
			int c=a+b;
			a=b;
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
		while (a > 0) {
			int digit = a % 10;
			rev = rev * 10 + digit;
			a = a / 10;
		}
		System.out.println(rev);
	}
}

//print prime number from 1 to 50
public class Practice3 {

	public static void main(String[] args) {
		int num = 10;// 10
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime number");
		} else {
			System.out.println("is not prime number");
		}
	}
}

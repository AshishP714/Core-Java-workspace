//1234------4321 reverse the number
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

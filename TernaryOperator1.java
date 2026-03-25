package Exercise;

public class TernaryOperator1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		int c = 40;
		
		int sum = (a > b)?(b > c ? a : c):(b > c ? b : c);
		
		System.out.println(sum);
	}
} 
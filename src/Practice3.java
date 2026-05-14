//print prime number from 1 to 50
public class Practice3 {

	public static void main(String[] args) {
		int num = 10;// 10
		int count = 0;
		for (int i = 1; i <= num; i++) {// 1<=10
			if (num % i == 0) {// 0,0,1,2,0,4,3,2,1,0 =4 count
				count++;
			}

		}
		if (count == 2) {// count==3--false
			System.out.println("prime number");
		} else {
			System.out.println(num+" "+"is not prime number");// so this block of code execute as 10 is not prime number
		}

	}

}

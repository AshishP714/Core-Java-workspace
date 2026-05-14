//print the number from 1 to 50 but skip number divisible by 7
public class Divisible {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++){
			if(i%7==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}

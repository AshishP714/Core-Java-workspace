package CollectionFramewor;

public class Fibonoci {

	public static void main(String[] args) {
		
		int num = 1;
		int temp = 1;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num);

			int count = num + temp;
			num = temp;
			temp = count;
		}
	}
}

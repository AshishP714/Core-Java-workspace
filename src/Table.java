//print table of 9 but stop when product become more then 50
public class Table {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i * 9 > 50) {
				break;
			}
			System.out.println(i * 9);
		}
	}

}

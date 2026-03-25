package Exercise;

public class CheckNumberTernary4 {

	public static void main(String[] args) {
		
		int num = 199;
		
		String result = (num < 0) ? "Nigitive" : (num > 0) ? "Positive" : "Zero";
		
		System.out.println(result);
	}
}
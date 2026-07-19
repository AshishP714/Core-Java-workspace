import java.util.Scanner;

public class Email {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String []email = new String[5];
		
		System.out.println("Enter email id : ");
		for (int i = 0; i < email.length; i++) {
			email[i]=scanner.next();
		}
		
		for (int i = 0; i < email.length; i++) {
			System.out.println(email[i].substring(email[i].indexOf("@")+1, email[i].indexOf(".")));
		}
	}
}

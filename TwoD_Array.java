import java.util.Scanner;

public class TwoD_Array extends Revision{

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		System.out.println("Enter email: ");
		String email = scanner.nextLine();
		System.out.println("Enter address: ");
	    String address = scanner.nextLine();
		System.out.println("Enter phone: ");
		long phone = scanner.nextLong();
		System.out.println("Enter pnr: ");
		long pnr = scanner.nextLong();
		
		Revision revision = new Revision(76,76);
		revision.setName(name);
		revision.setEmail(email);
		revision.setAddress(address);
		revision.setPhone(phone);
		revision.setPnr(pnr);
		System.out.println("\nCandidate details..-> ");
		System.out.println(revision.getName());
		System.out.println(revision.getEmail());
		System.out.println(revision.getAddress());
		System.out.println(revision.getPhone());
		System.out.println(revision.getPnr());
	}
}

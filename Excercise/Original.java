package Exercise;

public class Original implements Test {

	@Override
	public void testing() {
		System.out.println("Test successful ");
	}
	
	public void name(String name) {
		System.out.println(name);
	}
	
	public void status(boolean status) {
		if (status == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
	
	public static void main(String[] args) {
		Original original = new Original();
		
		original.testing();
		original.name("Ashish");
		original.status(true);
		System.out.println(original.equals(original));
	}
}
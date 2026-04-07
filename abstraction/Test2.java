package RevisionCodes;

public class Test2 {

	public static void main(String[] args) {
		Parent.show();		// Parent static method
		Child.show();		// Child static method
		
		Parent p = new Child();
		p.show();    // Parent static method (compile-time resolution)
	}
}
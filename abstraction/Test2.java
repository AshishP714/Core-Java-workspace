package RevisionCodes;

public class Test2 {

	public static void main(String[] args) {
		Parent.show();
		Child.show();
		
		Parent p = new Child();
		p.show();
	}
}

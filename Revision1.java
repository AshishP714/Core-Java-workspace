package java8;

public class Revision1 {

	public static String print() {
		return "Hi sonu";
	}
	
	public void sayHi(String a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Revision1 s = new Revision1();
		
		s.sayHi(print());
	}
}
package Exercise;

public class Test11 {

	void method1() {
		int data = 50 / 0;
	}

	void method2() {
		method1();
	}

	void method3() {
		try {
			method2();
		} catch (ArithmeticException e) {
			System.out.println("Handled in method3");
		}
	}

	public static void main(String[] args) {
		Test11 obj = new Test11();
		obj.method3();
	}
}
package switchcase;

// Accept two numbers and an operator (+, -, *, /) from the user and perform the operation using a switch case.
public class Operator {

	public static void main(String[] args) {
		int num1 = 2, num2 = 4;
		char sign = '&';
		switch (sign) {
		case '+':
			System.out.println("Addition" + (num1 + num2));
			break;
		case '-':
			System.out.println("Substraction" + (num1 - num2));
			break;
		case '*':
			System.out.println("Multiplication" + (num1 * num2));
			break;
		case '/':
			System.out.println("Divide" + (num1 / num2));
			break;
		case '%':
			System.out.println("Modulus" + (num1 % num2));
			break;
		default: {
			System.out.println("invalid input");
		}
		}

	}

}

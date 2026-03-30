package Exercise;

public class Test7 {
	
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Divide by zero");
            }

            int arr[] = new int[2];
            arr[5] = 20;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index issue");
        }
    }
}
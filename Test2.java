package Exercise;

public class Test2 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            arr[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
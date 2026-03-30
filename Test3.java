package Exercise;

public class Test3 {
    public static void main(String[] args) {
        try {
            int num = 100 / 10;
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
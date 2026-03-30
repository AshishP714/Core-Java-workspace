package Exercise;

public class Test10 {
    static void recursiveMethod() {
        recursiveMethod();
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Stack Overflow Error occurred");
        }
    }
}
public class PropagationExample {

    public void method3() {
        int result = 50 / 0;
    }

    public void method2() {
        method3();
    }

    public void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Exception Handle Ho Gayi method1 mein!");
        }
    }

    public static void main(String[] args) {
        PropagationExample obj = new PropagationExample();
        obj.method1();
        System.out.println("Program normal aage chal raha hai...");
    }
}

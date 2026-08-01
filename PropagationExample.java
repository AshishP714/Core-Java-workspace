public class PropagationExample {

    void method3() {
        int result = 50 / 0; // ❌ Yahan ArithmeticException aayi (Divide by zero)
    }

    void method2() {
        method3(); // method3 ko call kiya, par handle nahi kiya -> Propagate hui
    }

    void method1() {
        try {
            method2(); // method2 ko call kiya aur try-catch mein daal diya
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

package Exercise;

public class SumOddRecursive {

    public static int sumOdd(int n) {
        if (n == 1) {
            return 1;
        }

        return (2 * n - 1) + sumOdd(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOdd(n));
    }
}
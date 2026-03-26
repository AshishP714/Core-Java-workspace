package Exercise;

public class CountOddRecursive {

    public static int countOdd(int n) {
        if (n == 0) {
            return 0;
        }

        if (n % 2 != 0) {
            return 1 + countOdd(n - 1);
        } else {
            return countOdd(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(countOdd(10));
    }
}
import java.util.*;

public class BallArrangement {

    static int totalWays = 0;

    public static void main(String[] args) {
        int G = 1, Y = 1, R = 1;   // Example Input

        findWays(G, Y, R, ' ', "");  // Start recursion

        System.out.println("Output: " + totalWays);
    }

    // Recursive function
    static void findWays(int g, int y, int r, char prev, String curr) {
        
        // Base case: all balls are used
        if (g == 0 && y == 0 && r == 0) {
            System.out.println(curr);
            totalWays++;
            return;
        }

        // Try placing Green (G)
        if (g > 0 && prev != 'G') {
            findWays(g - 1, y, r, 'G', curr + "G");
        }

        // Try placing Yellow (Y)
        if (y > 0 && prev != 'Y') {
            findWays(g, y - 1, r, 'Y', curr + "Y");
        }

        // Try placing Red (R)
        if (r > 0 && prev != 'R') {
            findWays(g, y, r - 1, 'R', curr + "R");
        }
    }
}

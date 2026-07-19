import java.util.*;

public class BallArrangement {

    static int totalWays = 0;

    public static void main(String[] args) {
        int G = 1, Y = 1, R = 1;  
        findWays(G, Y, R, ' ', "");  
        System.out.println("Output: " + totalWays);
    }

    static void findWays(int g, int y, int r, char prev, String curr) {
    
        if (g == 0 && y == 0 && r == 0) {
            System.out.println(curr);
            totalWays++;
            return;
        }
        
        if (g > 0 && prev != 'G') {
            findWays(g - 1, y, r, 'G', curr + "G");
        }
        
        if (y > 0 && prev != 'Y') {
            findWays(g, y - 1, r, 'Y', curr + "Y");
        }
        
        if (r > 0 && prev != 'R') {
            findWays(g, y, r - 1, 'R', curr + "R");
        }
    }
}

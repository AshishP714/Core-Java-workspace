import java.util.*;
public class EntryExit {
    public static void main(String[] args) {
        int[] entry = {3, 5, 2, 0};
        int[] exit  = {0, 2, 4, 4};
        int result = 0;
        int max = 0;
        for (int i = 0; i < entry.length; i++) {
            result += entry[i] - exit[i];
            if (result > max) max = result;
        }
        System.out.println(max);
    }
}

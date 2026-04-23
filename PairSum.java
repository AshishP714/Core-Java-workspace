package practice_2;

import java.util.HashSet;

public class PairSum {
	
    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 5, 7, 8};
        int target = 7;

        findPairs(arr, target);
    }

    public static void findPairs(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }

            set.add(num);
        }
    }
}
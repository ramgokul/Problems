package problems.arrays.batch10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinSwapsToSortAnArray {
    /*
        Given an array of n distinct elements, find the minimum number of swaps required to sort the array.

        Examples:

        Input : {4, 3, 2, 1}
        Output : 2
        Explanation : Swap index 0 with 3 and 1 with 2 to
                      form the sorted array {1, 2, 3, 4}.

        Input : {1, 5, 4, 3, 2}
        Output : 2
     */

    public static void main(String[] args) {
        int[] ar = {1, 5, 4, 3, 2};
        findMinSwapsToSort(ar);
    }

    static int findMinSwapsToSort(int[] ar) {
        int n = ar.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            m.put(ar[i], i);
        }
        Arrays.sort(ar);
        for (int i = 0; i < n; i++) {
            ar[i] = m.get(ar[i]);
        }
        m = null;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int val = ar[i];
            if (val < 0) continue;
            while (val != i) {
                int new_val = ar[val];
                ar[val] = -1;
                val = new_val;
                swaps++;
            }
            ar[i] = -1;
        }
        return swaps;
    }
}

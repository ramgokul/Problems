package problems.arrays.batch10;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountPairsWithDiffEqualToK {
    /*
        Given an integer array and a positive integer k, count all distinct pairs with difference equal to k.
        Examples:

        Input: arr[] = {1, 5, 3, 4, 2}, k = 3
        Output: 2
        There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2}

        Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
        Output: 5
        There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8},
        {8, 12}, {12, 16} and {16, 20}
     */

    public static void main(String[] args) {
        int arr[] = {8, 12, 16, 4, 0, 20}, k = 4;
        Set<Integer> set = new HashSet<>();
        int pairCount = 0;

        for (int x : arr){
            set.add(x);
        }

        for (int x : arr){
            if (set.contains(x+k)){
                pairCount++;
            }
        }

        System.out.println("Pair count : "+pairCount);
    }
}

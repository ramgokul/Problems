package problems.arrays.batch8;

import java.util.HashSet;
import java.util.Set;

public class CountPairsFromTwoSortedArrays {

    /*
        Given two sorted arrays of size m and n of distinct elements. Given a value x. The problem is to count all pairs from both arrays whose sum is equal to x.
        Note: The pair has an element from each array.

        Examples :

        Input : arr1[] = {1, 3, 5, 7}
                arr2[] = {2, 3, 5, 8}
                x = 10

        Output : 2
        The pairs are:
        (5, 5) and (7, 3)

        Input : arr1[] = {1, 2, 3, 4, 5, 7, 11}
                arr2[] = {2, 3, 4, 5, 6, 8, 12}
                x = 9

        Output : 5
     */

    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 3, 5, 8};
        int x = 10;
        int counter = 0;

        Set<Integer> set = new HashSet<>();

        for (int n : arr1){
            set.add(n);
        }

        for (int y : arr2){
            if (set.contains(x-y)) {
                counter++;
                System.out.println("Pair --> " + y + ", " + (x - y));
            }
        }

        System.out.println("Number of pairs : "+counter);
    }

}

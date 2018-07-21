package problems.arrays.batch2;

import java.util.HashSet;
import java.util.Set;

public class FindTheSmallestMissingNumber {
    /*
        Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. Find the smallest number that is missing from the array.

        Examples
        Input: {0, 1, 2, 6, 9}, n = 5, m = 10
        Output: 3

        Input: {4, 5, 10, 11}, n = 4, m = 12
        Output: 0

        Input: {0, 1, 2, 3}, n = 4, m = 5
        Output: 4

        Input: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11
        Output: 8
     */

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        int m = 10;

        int[] arr2 = {4, 5, 10, 11};

        smallestMissingNumber(arr,m);
        smallestMissingNumber(arr2, 12);
    }

    public static int smallestMissingNumber(int[] nums, int m){
        Set<Integer> set = new HashSet<>();
        int i;

        for (int n : nums){
            set.add(n);
        }

        for (i=0; i<m-1; i++){
            if (!set.contains(i)){
                System.out.println("Smallest missing number : "+i);
                break;
            }
        }

        return i;
    }
}

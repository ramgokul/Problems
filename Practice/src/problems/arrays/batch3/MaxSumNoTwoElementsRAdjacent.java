package problems.arrays.batch3;

import java.util.Map;

public class MaxSumNoTwoElementsRAdjacent {
    /*
        Given an array of positive numbers, find the maximum sum of a subsequence with the constraint that no 2 numbers in the sequence should be adjacent in the array. So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).Answer the question in most efficient way.

        Examples :

        Input : arr[] = {5, 5, 10, 100, 10, 5}
        Output : 110

        Input : arr[] = {1, 2, 3}
        Output : 4

        Input : arr[] = {1, 20, 3}
        Output : 20

        Algorithm:
        Loop for all elements in arr[] and maintain two sums incl and excl where incl = Max sum including the previous element and excl = Max sum excluding the previous element.

        Max sum excluding the current element will be max(incl, excl) and max sum including the current element will be excl + current element (Note that only excl is considered because elements cannot be adjacent).

        At the end of the loop return max of incl and excl.

     */

    public static void main(String[] args) {
        int arr[] = {5, 5, 10, 100, 10, 5};
        maxSum(arr);
    }

    public static void maxSum(int[] nums){
        int incl = nums[0];
        int excl = 0;

        for (int i=1; i<nums.length; i++){
            int excl_new = Math.max(incl,excl);
            incl = excl + nums[i];
            excl = excl_new;
        }

        System.out.println("Max sum : "+Math.max(incl,excl));
    }
}

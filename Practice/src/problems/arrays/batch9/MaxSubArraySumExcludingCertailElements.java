package problems.arrays.batch9;

import java.util.HashSet;
import java.util.Set;

public class MaxSubArraySumExcludingCertailElements {

    /*
        Given an array of A of n integers and an array B of m integers find the Maximum Contiguous Subarray Sum of array A such that any element of array B is not present in that subarray

        Examples :

        Input : A = {1, 7, -10, 6, 2}, B = {5, 6, 7, 1}
        Output : 2
        Explanation Since the Maximum Sum Subarray of A is not allowed to have any element that is present in array B.
        The Maximum Sum Subarray satisfying this is {2} as the only allowed subarrays are:{-10} and {2}. The Maximum Sum Subarray being {2} which sums to 2

        Input : A = {3, 4, 5, -4, 6}, B = {1, 8, 5}
        Output : 7

        Explanation
        The Maximum Sum Subarray satisfying this is {3, 4} as the only allowed subarrays are {3}, {4}, {3, 4}, {-4}, {6}, {-4, 6}. The Maximum Sum subarray being {3, 4} which sums to 7
     */

    public static void main(String[] args) {
        int A[] = { 3, 4, 5, -4, 6 };
        int B[] = { 1, 8, 5 };

        int curr_sum = 0, max_so_far = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for (int x : B){
            set.add(x);
        }

        for (int n : A){

            if (set.contains(n)){
                curr_sum = 0;
                continue;
            }

            curr_sum += n;
            max_so_far = Math.max(max_so_far, curr_sum);
        }

        System.out.println("Max sub-array sum : "+max_so_far);

    }
}

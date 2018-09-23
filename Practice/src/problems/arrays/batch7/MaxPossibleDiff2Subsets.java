package problems.arrays.batch7;

import java.util.HashMap;
import java.util.Map;

public class MaxPossibleDiff2Subsets {

    /*
        Given an array of n-integers. Array may contain repetitive elements but the highest frequency of any elements must not exceed two. You have to make two subsets such that difference of their elements sum is maximum and both of them jointly contains all of elements of given array along with the most important condition, no subset should contain repetitive elements.

        Examples:

        Input : arr[] = {5, 8, -1, 4}
        Output : Maximum Difference = 18
        Explanation :
        Let Subset A = {5, 8, 4} & Subset B = {-1}
        Sum of elements of subset A = 17, of subset B = -1
        Difference of Sum of Both subsets = 17 - (-1) = 18

        Input : arr[] = {5, 8, 5, 4}
        Output : Maximum Difference = 12
        Explanation :
        Let Subset A = {5, 8, 4} & Subset B = {5}
        Sum of elements of subset A = 17, of subset B = 5
        Difference of Sum of Both subsets = 17 - 5 = 12

        While building up the subsets, take care that no subset should contain repetitive elements. And for this we can conclude that all such elements whose frequency are 2, going to be part of both subsets and hence overall they don’t have any impact on difference of subset sum. So, we can easily ignore them.
        For making the difference of sum of elements of both subset maximum we have to make subset in such a way that all positive elements belongs to one subset and negative ones to other subset.
     */

    public static void main(String[] args) {
        int[] nums = {5, 8, -1, 4};
        int pos_sum = 0, neg_sum = 0;

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            if (nums[i] > 0){
                map1.put(nums[i], map1.getOrDefault(nums[i], 0)+1);
            }

            if (nums[i] < 0){
                map2.put(nums[i], map2.getOrDefault(nums[i], 0)+1);
            }
        }

        System.out.println(map1);
        System.out.println(map2);

        for (int n : nums){

            if (map1.containsKey(n) && map1.get(n) == 1){
                pos_sum += n;
            }


            if (map2.containsKey(n) && map2.get(n) == 1) {
                neg_sum += n;
            }

        }

        System.out.println(pos_sum);
        System.out.println(neg_sum);

        int max_diff = Math.abs(pos_sum - neg_sum);
        System.out.println("Max difference : "+max_diff);
    }
}

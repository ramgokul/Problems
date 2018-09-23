package problems.arrays.batch7;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithZeroSum {

    /*
        Given an array of integers, find length of the largest subarray with sum equals to 0.

        Examples :

        Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        Output: 5
        The largest subarray with 0 sum is -2, 2, -8, 1, 7

        Input: arr[] = {1, 2, 3}
        Output: 0
        There is no subarray with 0 sum

        Input: arr[] = {1, 0, 3}
        Output: 1
     */

    public static void main(String[] args) {
//        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int[] arr = {1,4,-2,-2,5,-4,3};
        int sum = 0, max_len = 0, i=0, startIndex = -1;
        Integer prev_i = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (i=0; i<arr.length; i++){
            sum += arr[i];

            if (arr[i] == 0 && max_len == 0){
                max_len = 1;
            }

            if (sum == 0){
                max_len = i+1;
            }

            prev_i = map.get(sum);

            if (prev_i != null){
                startIndex = prev_i;
                max_len = Math.max(max_len, i-prev_i);
            }else {
                map.put(sum, i);
            }
        }

        System.out.println("Max length : "+max_len);
//        System.out.println("Start Index : "+startIndex+ ", End Index : "+i);
    }
}

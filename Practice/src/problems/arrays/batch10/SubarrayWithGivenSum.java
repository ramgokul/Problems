package problems.arrays.batch10;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithGivenSum {

    /*
        Given an unsorted array of nonnegative integers, find a continous subarray which adds to a given number.
        Examples :

        Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
        Ouptut: Sum found between indexes 2 and 4

        Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
        Ouptut: Sum found between indexes 1 and 4

        Input: arr[] = {1, 4}, sum = 0
        Output: No subarray found
        There may be more than one subarrays with sum as the given sum. The following solutions print first such subarray.
     */

    public static void main(String[] args) {
//        int arr[] = {1, 4, 20, 3, 10, 5}, sum = 33;
//        int arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7;
        int arr[] = {10, 2, -2, -20, 10}, sum = -10;

//        approach_positive_only(arr, arr.length, 7);
        approach_neg_also(arr, arr.length, sum);

    }

    static void approach_positive_only(int[] arr, int n, int sum){

        int start = 0, end = 0, total = 0;
//        int n = arr.length;

        for (int i=0; i<arr.length; i++){

            while (end < n && total < sum){
                total += arr[end++];
            }

            if (total == sum){
                System.out.println("Sub array is bw "+start+ " and "+(end-1));
                return;
            }

            while (start < n && total > sum){
                total -= arr[start++];
            }
        }

        System.out.println("Sub array not found");
    }

    static void approach_neg_also(int[] arr, int n, int sum){
        int curr_sum =0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            curr_sum += arr[i];


            if (curr_sum == sum) {
                System.out.println("Sub-array is bw 0 and " + i);
                return;
            }

            if (map.containsKey(curr_sum - sum)){
                System.out.println("Sub-array is bw 0 and " + i);
                return;
            }else {
                map.put(curr_sum, i);
            }
        }
    }
}

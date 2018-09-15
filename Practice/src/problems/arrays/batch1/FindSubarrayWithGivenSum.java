package problems.arrays.batch1;

import java.util.HashMap;
import java.util.Map;

public class FindSubarrayWithGivenSum {

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

        Source: Google Interview Question
     */

    public static void main(String[] args) {
//        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int arr[] = { 10, 2, -2, -20, 10 };
        int n = arr.length;
//        int sum = 23;
        int sum = -10;
        arraySum3(arr, n, sum);
    }

    public static int arraySum(int[] A, int n, int sum){
        int curr_sum = A[0];
        int start = 0;

        for (int i=1; i<n; i++){

            while (curr_sum > sum && start < i-1){
                curr_sum -= A[start];
                start++;
            }

            if (curr_sum == sum){
                System.out.println("Sum found between indices "+start+ " and "+(i-1));
                return 1;
            }

//            if (i<n){
                curr_sum += A[i];
//            }
        }

        System.out.println("No sub-array found");
        return 0;
    }

    public static int arraySum2(int[] A, int n, int sum){
        int curr_sum = 0, start = 0, end = 0;

        while (end < n){

            while (curr_sum < sum && end < n){
                curr_sum += A[end];
                end++;
            }

            if (curr_sum == sum){
                System.out.println("sub array found "+start+ "  and "+end);
                return 1;
            }

            while (curr_sum > sum && start < n){
                curr_sum -= A[start];
                start++;
            }
        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void arraySum3(int[] arr, int n, int sum){
        int curr_sum = 0, end =0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++){

            curr_sum += arr[i];

            if (curr_sum == sum){
                System.out.println("Sum found bw 0 and "+i);
                return;
            }

            if (map.containsKey(curr_sum - sum)){
                int index = map.get(curr_sum - sum)+1;
                System.out.println("Sum found bw "+index+ " and "+i);
                return;
            }

            map.put(curr_sum, i);
        }

        System.out.println("No subarray found");
    }
}

package problems.arrays.batch1;

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
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        arraySum(arr, n, sum);
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
}

package problems.arrays.batch1;

public class SmallestSubArrayWithSumGr8GivenValue {

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 0, 19};
        int x  =  51;
        System.out.println(minSubarray(arr, arr.length, x));
    }

    public static int minSubarray(int[] arr, int n, int x){
        int start = 0, end = 0;
        int curr_sum = 0, min_len = n + 1;

        while (end < n){

            while (curr_sum <= x && end < n){
                curr_sum += arr[end];
                end++;
            }

            while (curr_sum > x && start < n){
                curr_sum -= arr[start];
                start++;

                if ((end - start) < min_len){
                    min_len = end - start;
                }
            }
        }

        return min_len;
    }
}

package problems.arrays.batch11;

import java.util.stream.IntStream;

public class MaxEquilibriumSum {

    /*
        Given an array arr[]. Find maximum value of prefix sum which is also suffix sum for index i in arr[].

        Examples :

        Input : arr[] = {-1, 2, 3, 0, 3, 2, -1}
        Output : 4
        Prefix sum of arr[0..3] =
                    Suffix sum of arr[3..6]

        Input : arr[] = {-2, 5, 3, 1, 2, 6, -4, 2}
        Output : 7
        Prefix sum of arr[0..3] =
                      Suffix sum of arr[3..7]
     */

    public static void main(String[] args) {
        int arr[] = {-1, 2, 3, 0, 3, 2, -1};
        System.out.println(max_equilibrium_sum(arr));
    }

    static int max_equilibrium_sum(int[] arr){
        int sum = IntStream.of(arr).sum();
        int result = Integer.MIN_VALUE;
        int prefix_sum = 0;

        for (int i=0; i<arr.length; i++){
            prefix_sum += arr[i];

            if (prefix_sum == sum){
                result = Math.max(result, prefix_sum);
            }
            sum -= arr[i];
        }

        return result;
    }
}

package problems.arrays.batch2;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicatesWithinK {
    /*
        Given an unsorted array that may contain duplicates.
        Also given a number k which is smaller than size of array.
        Write a function that returns true if array contains duplicates within k distance.

        Examples:

        Input: k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4}
        Output: false
        All duplicates are more than k distance away.

        Input: k = 3, arr[] = {1, 2, 3, 1, 4, 5}
        Output: true
        1 is repeated at distance 3.

        Input: k = 3, arr[] = {1, 2, 3, 4, 5}
        Output: false

        Input: k = 3, arr[] = {1, 2, 3, 4, 4}
        Output: true
     */

    static void check_duplicates(int[] arr, int k){
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<arr.length; i++){

            if (set.contains(arr[i])){
                System.out.println("true");
                break;
            }else {
                set.add(arr[i]);
            }

            if (i>=k){
                set.remove(arr[i-k]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
        check_duplicates(arr, 3);
    }
}

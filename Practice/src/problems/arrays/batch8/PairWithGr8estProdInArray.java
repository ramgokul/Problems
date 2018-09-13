package problems.arrays.batch8;

import java.util.*;

public class PairWithGr8estProdInArray {

    /*
        Given an array of n elements, the task is to find the greatest number such that it is product of two elements of given array. If no such element exists, print -1. Elements are within the range of 1 to 10^5.

        Examples :

        Input :  arr[] = {10, 3, 5, 30, 35}
        Output:  30
        Explanation: 30 is the product of 10 and 3.

        Input :  arr[] = {2, 5, 7, 8}
        Output:  -1
        Explanation: Since, no such element exists.

        Input :  arr[] = {10, 2, 4, 30, 35}
        Output:  -1

        Input :  arr[] = {10, 2, 2, 4, 30, 35}
        Output:  4

        Input  : arr[] = {17, 2, 1, 35, 30}
        Output : 35

     */


    public static void main(String[] args) {

        int arr[] = {10, 3, 5, 30, 35};
//        int arr[] = {10, 2, 2, 4};
        Arrays.sort(arr);

        int result = -1;

        Map<Integer, Integer> set = new HashMap<>();

        for (int n : arr) {
            set.put(n, set.getOrDefault(n, 0) + 1);
        }

        for (int i = arr.length - 1; i>0; i--) {
            for (int j = 0; j < i && arr[j] <= Math.sqrt(arr[i]); j++) {

                if (arr[i] % arr[j] == 0){

                    result = arr[i] / arr[j];

                    if (result != arr[j] && set.containsKey(result)){
                        System.out.println("Max prod : "+arr[i]);
                        return;
                    }

                    if (result == arr[j] && set.containsKey(result) && set.get(result) > 1){
                        System.out.println("Max prod : "+arr[i]);
                        return;
                    }
                }

            }
        }
    }
}

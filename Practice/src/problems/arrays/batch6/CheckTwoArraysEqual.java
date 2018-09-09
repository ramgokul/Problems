package problems.arrays.batch6;

import java.util.HashMap;
import java.util.Map;

public class CheckTwoArraysEqual {

    /*
            Given two given arrays of equal length, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.

            Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

            Examples :

            Input  : arr1[] = {1, 2, 5, 4, 0};
                     arr2[] = {2, 4, 5, 0, 1};
            Output : Yes

            Input  : arr1[] = {1, 2, 5, 4, 0, 2, 1};
                     arr2[] = {2, 4, 5, 0, 1, 1, 2};
            Output : Yes

            Input : arr1[] = {1, 7, 1};
                    arr2[] = {7, 7, 1};
            Output : No

     */

    static boolean array_equality(int[] a1, int[] a2){

        if (a1.length != a2.length){
            return false;
        }

        Map<Integer,Integer> hmap = new HashMap<>();

        for (int n : a1){
            hmap.put(n, hmap.getOrDefault(n, 0)+1);
        }

        for (int i=0; i<a1.length; i++) {

            if (!hmap.containsKey(a2[i])) {
                return false;
            }

            if (hmap.get(a2[i]) == 0) {
                return false;
            }

            int count = hmap.get(a2[i]);
            --count;
            hmap.put(a2[i], count);
        }


        for(int j = 0; j < a1.length; j++)
            {
                if (hmap.get(a2[j]) > 0)
                    return false;
            }

            return true;


    }

    public static void main(String[] args) {
//        int arr1[] = { 3, 5, 2, 5, 2};
//        int arr2[] = { 2, 3, 5, 5, 2};

        int[] arr1 = {1,7,1};
        int[] arr2 = {7,7,1};

        Boolean b = array_equality(arr1, arr2);
        System.out.println(b);
    }
}

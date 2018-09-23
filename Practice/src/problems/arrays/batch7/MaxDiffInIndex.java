package problems.arrays.batch7;

import java.util.HashMap;
import java.util.Map;

public class MaxDiffInIndex {

    /*
        Given an array of n integers. The task is to find the difference of first and last index of each distinct element so as to maximize the difference.

        Examples:

        Input : {2, 1, 3, 4, 2, 1, 5, 1, 7}
        Output : 6
        Element 1 has its first index = 1
        and last index = 7
        Difference = 7 - 1 = 6
        Other elements have a smaller first and last
        index difference

        Input : {2, 2, 1, 1, 8, 8, 3, 5, 3}
        Output : 2
        Maximum difference is for indexes of element 3.
     */

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 2, 1, 5, 1, 7};
        Map<Integer, Integer> map = new HashMap<>();
        int max_diff = -1;
        int num = -1;

        for (int i=0; i< arr.length; i++){

            if (!map.containsKey(arr[i])){
                map.put(arr[i], i);
            }else {
                int diff = i - map.get(arr[i]);

                if (max_diff < diff){
                    max_diff = diff;
                    num = map.get(arr[i]);
                }
            }

        }

        System.out.println(""+num+ " has max difference of "+max_diff);
    }
}

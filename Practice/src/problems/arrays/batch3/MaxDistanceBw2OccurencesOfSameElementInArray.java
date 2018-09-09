package problems.arrays.batch3;

import java.util.HashMap;
import java.util.Map;

public class MaxDistanceBw2OccurencesOfSameElementInArray {

    /*
        Given an array with repeated elements, the task is to find the maximum distance two occurrences of an element.

        Examples:

        Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
        Output: 10
        // maximum distance for 2 is 11-1 = 10
        // maximum distance for 1 is 4-2 = 2
        // maximum distance for 4 is 10-5 = 5
     */

    static void maxDistance(int[] arr){
        Map<Integer, Integer> hmap = new HashMap<>();
        int max_value = 0;

        for (int i=0; i<arr.length; i++){

            if (!hmap.containsKey(arr[i])){
                hmap.put(arr[i], i);
            }else {
                max_value = Math.max(max_value, i - hmap.get(arr[i]));
            }

        }

        System.out.println(max_value);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        maxDistance(arr);
    }
}

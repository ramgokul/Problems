package problems.arrays.batch11;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    /*
        Given an array A[] of integers. The task is to find the total number of ordered pairs of positive integers (X, Y) such that X occurs in A[] at least Y times and Y occurs in A at least X times.

        Examples:

        Input : A[] = { 1, 1, 2, 2, 3 }
        Output : 4
        Ordered pairs are -> { [1, 1], [1, 2], [2, 1], [2, 2] }

        Input : A = { 3, 3, 2, 2, 2 }
        Output : 3
        Ordered pairs are -> { [3, 2], [2, 2], [2, 3] }
     */

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] arr = { 3, 3, 2, 2, 2 };

        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for (int key : map.keySet()){
            int x = key;
            int y = map.get(x);

            for (int j=1; j<=y; j++){
                if (map.get(j) != null && map.get(j) >= x){
                    System.out.println(""+x+ ","+j);
                }
            }
        }
    }
}

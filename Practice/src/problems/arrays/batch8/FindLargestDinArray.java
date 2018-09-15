package problems.arrays.batch8;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class FindLargestDinArray {
    /*
        Given a set S (all distinct elements) of integers, find the largest d such that a + b + c = d
        where a, b, c, and d are distinct elements of S.

        Constraints:
        1 ≤ number of elements in the set ≤ 1000
        INT_MIN ≤ each element in the set ≤ INT_MAX
        Examples :

        Input : S[] = {2, 3, 5, 7, 12}
        Output : 12
        Explanation: 12 is the largest d which can be represented as 12 = 2 + 3 + 7

        Input : S[] = {2, 16, 64, 256, 1024}
        Output : No solution
     */

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 12};
        Map<Integer, Pair<Integer, Integer>> map = new HashMap<>();
        int sum = 0;
        int dif = 0;
        int max = 0;

        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                sum = arr[i] + arr[j];
                map.put(sum, new Pair<>(i, j));
            }
        }
        System.out.println(map);


        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                dif = Math.abs(arr[i] - arr[j]);

                if (map.containsKey(dif)){
                    Pair<Integer, Integer> p = map.get(dif);

                    int pKey = p.getKey();
                    int pVal = p.getValue();

                    if (pKey != i && pVal != i && pKey != j && pVal != j ){
                        max = Math.max(max, Math.max(arr[i], arr[j]));
                    }
                }
            }
        }

        System.out.println("Max d : "+max);
    }
}

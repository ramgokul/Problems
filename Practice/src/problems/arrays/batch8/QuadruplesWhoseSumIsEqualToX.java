package problems.arrays.batch8;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class QuadruplesWhoseSumIsEqualToX {

    /*
        Given four sorted arrays each of size n of distinct elements. Given a value x. The problem is to count all quadruples(group of four numbers) from all the four arrays whose sum is equal to x.

        Note: The quadruple has an element from each of the four arrays.

        Examples:

        Input : arr1 = {1, 4, 5, 6},
                arr2 = {2, 3, 7, 8},
                arr3 = {1, 4, 6, 10},
                arr4 = {2, 4, 7, 8}
                n = 4, x = 30

        Output : 4
        The quadruples are:
        (4, 8, 10, 8), (5, 7, 10, 8),
        (5, 8, 10, 7), (6, 7, 10, 7)

        Input : For the same above given fours arrays
                x = 25
        Output : 14
     */

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 6};
        int[] arr2 = {2, 3, 7, 8};
        int[] arr3 = {1, 4, 6, 10};
        int[] arr4 = {2, 4, 7, 8};
        int n = 4, x = 30;

        int sum1 = 0, sum2 = 0;

        Map<Integer, Pair<Integer,Integer>> map1 = new HashMap<>();

        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2.length; j++){
                sum1 = arr1[i] + arr2[j];
                map1.put(sum1, new Pair<>(arr1[i], arr2[j]));
            }
        }

        for (int k=0; k<arr3.length; k++){
            for (int l=0; l<arr4.length; l++){
                sum2 = arr3[k] + arr4[l];
                int p_sum = x - sum2;

                if (map1.containsKey(p_sum)){
                    System.out.println(""+arr3[k]+ ","+arr4[k]+ ","+map1.get(p_sum).getKey()+ ","+map1.get(p_sum).getValue());
                }
            }
        }

//        Pair<Integer, Integer> p = new Pair<>(3,4);
//        System.out.println(p.getKey());

//        Map<Integer, Pair<Integer,Integer>> m = new HashMap<>();
//        m.put(10, new Pair<>(3,7));
//
//        System.out.println(m.get(10).getKey());
//        System.out.println(m.get(10).getValue());

    }
}

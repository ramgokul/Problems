package problems.arrays.batch8;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class FourElementsThatSumToAGivenValue {

    /*
        Given an array of integers, find any one combination of four elements in the array whose sum is equal to a given value X.
        For example, if the given array is {10, 2, 3, 4, 5, 9, 7, 8} and X = 23,
        then your function should print “3 5 7 8” (3 + 5 + 7 + 8 = 23).
     */


    public static void main(String[] args) {
//        int arr[] = {10, 20, 30, 40, 1, 2};
        int[] arr = {10, 2, 3, 4, 5, 9, 7, 8};
        int x = 23;

        Map<Integer, Pair<Integer, Integer>> m = new HashMap<>();
        int sum = 0, p_sum=0;

        for (int i=0; i< arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                sum = arr[i] + arr[j];
                m.put(sum, new Pair<>(arr[i], arr[j]));
            }
        }

        for (int i=0; i< arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                p_sum = x - (arr[i] + arr[j]);

                if (m.containsKey(p_sum) && p_sum != arr[i] && p_sum != arr[j]){
                    System.out.println(""+arr[i]+","+arr[j]+","+m.get(p_sum).getKey()+","+m.get(p_sum).getValue());
                }

            }
        }

        System.out.println(m);
    }

}

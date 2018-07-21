package problems.arrays.batch6;

import java.util.HashMap;
import java.util.Map;

public class SortArrayAccorAbsoluteDiff {

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 9, 2};
        int k =7;

        Map<Integer,Integer> map = new HashMap();

        for (int a : arr){
            map.put(a, Math.abs(k-a));
        }

        map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue()).forEach(System.out::println);
    }

}

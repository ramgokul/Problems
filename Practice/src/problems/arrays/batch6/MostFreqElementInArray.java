package problems.arrays.batch6;

import java.util.HashMap;
import java.util.Map;

public class MostFreqElementInArray {

    static void most_frequent(int[] a){
        Map<Integer,Integer> map = new HashMap<>();

        for (int n : a){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        int max_count = 0, res = -1;

        for (Map.Entry<Integer,Integer> val : map.entrySet()){
            if (max_count < val.getValue()){
                max_count = val.getValue();
                res = val.getKey();
            }
        }

        System.out.println("Most frequent element : "+res);
    }


    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 20, 30, 20, 20};
        most_frequent(arr);
    }
}

package problems.arrays.batch0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortZeroesOnesTwos {

    /*
        Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[]. The functions should put all 0s first, then all 1s and all 2s in last.
        Examples:

        Input :  {0, 1, 2, 0, 1, 2}
        Output : {0, 0, 1, 1, 2, 2}

        Input :  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
        Output : {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
     */

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        int low=0, mid=0, temp=0;
        int high = arr.length-1;

        while (mid <= high){

            switch (arr[mid]){

                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }

        System.out.println(Arrays.toString(arr));

//        sortValues(arr);
    }

    static void sortValues(int[] nums){
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        System.out.println(map);

        int count = -1;

        for (Map.Entry<Integer, Integer> val : map.entrySet()){
            int key = val.getKey();
            int occurence = val.getValue();

            while (occurence > 0){
                count++;
                nums[count] = key;
                occurence--;
            }

        }

        System.out.println(Arrays.toString(nums));
    }
}

package problems.StringProblems.batch5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class simply {

    public static void main(String[] args) {
//        char[] temp = "bAwutndekWEdkd".toCharArray();
//        Arrays.sort(temp);
//        System.out.println(Arrays.toString(temp));

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7,8};

        int i=0;
        for (i=0; i<arr1.length && i< arr2.length; i++){
            System.out.println(arr1[i]);
            System.out.println(arr2[i]);
        }

        while (i < arr2.length){
            System.out.println(arr2[i]);
            i++;
        }
    }
}

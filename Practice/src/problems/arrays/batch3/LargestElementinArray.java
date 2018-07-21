package problems.arrays.batch3;

import java.util.Arrays;

public class LargestElementinArray {


    public static void main(String[] args) {
        int[] arr = {10,20,4};
        int max = arr[0];

        for (int n : arr){
            max = Math.max(n,max);
        }

        System.out.println("Largest element in array : "+max);
    }
}

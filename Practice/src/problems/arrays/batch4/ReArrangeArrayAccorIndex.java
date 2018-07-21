package problems.arrays.batch4;

import java.util.Arrays;

public class ReArrangeArrayAccorIndex {

    public static void main(String[] args) {
        int[] arr1 = {10, 11, 12};
        int[] arr2 = {1, 0, 2};

        rearrange(arr1, arr2);

    }

    public static void rearrange(int[] arr1, int[] arr2){

        int[] temp = new int[arr2.length];

        for (int i=0; i<arr2.length; i++){
            temp[arr2[i]] = arr1[i];
        }

        for (int i=0; i<arr2.length; i++){
            arr1[i] = temp[i];
            arr2[i] = i;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}

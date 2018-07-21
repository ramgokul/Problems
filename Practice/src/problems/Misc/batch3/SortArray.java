package problems.Misc.batch3;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
//        int[] arr = {12, 25, 99, 66, 33, 8, 9, 54, 47, 36};
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int temp;

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){

                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

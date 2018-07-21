package problems.Misc.batch2;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int temp = 0;
        int n = arr.length;

        for (int i=0; i<arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}

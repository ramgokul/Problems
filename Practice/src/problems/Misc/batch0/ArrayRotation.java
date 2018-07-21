package problems.Misc.batch0;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        //Store the number of elements to be rotated in a temp array
        int[] temp = Arrays.copyOf(arr,4);
        System.out.println(Arrays.toString(temp));

        int numPos = 0;
        int numPos2 = 0;

        //Push the other elements forward in the array
        for (int i = 4; i<arr.length; i++){
            arr[numPos++] = arr[i];
        }

        System.out.println(Arrays.toString(arr));

        //Replace the remaining ones with the temp array
        for (int i=numPos; i<arr.length; i++){
            arr[i] = temp[numPos2++];
        }

        System.out.println(Arrays.toString(arr));
    }
}

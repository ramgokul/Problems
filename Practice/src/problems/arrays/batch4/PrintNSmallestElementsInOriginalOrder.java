package problems.arrays.batch4;

import java.util.Arrays;

public class PrintNSmallestElementsInOriginalOrder {

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 1, 5};
        int k = 3;

        int[] copy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        Arrays.copyOf(copy,k);

        int[] anotherCopy = Arrays.copyOf(copy,k);

        System.out.println(Arrays.toString(anotherCopy));

        for (int a : arr){
            if (Arrays.binarySearch(anotherCopy,a) >= 0){
                System.out.print(a + " ");
//                break;
            }

        }

    }
}

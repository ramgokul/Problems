package problems.arrays.batch11;

public class ProdOfMaxInFirstArrNMinInSecond {

    /*
        Given two arrays, the task is to calculate the product of max element of first array and min element of second array

        References : Asked in Adobe (Source : Careercup)

        Examples :

        Input : arr1[] = {5, 7, 9, 3, 6, 2},
                arr2[] = {1, 2, 6, -1, 0, 9}
        Output : max element in first array
        is 9 and min element in second array
        is -1. The product of these two is -9.

        Input : arr1[] = {1, 4, 2, 3, 10, 2},
                arr2[] = {4, 2, 6, 5, 2, 9}
        Output : max element in first array
        is 10 and min element in second array
        is 2. The product of these two is 20.
     */

    public static void main(String[] args) {
        int arr1[] = {1, 4, 2, 3, 10, 2}, arr2[] = {4, 2, 6, 5, 2, 9};
        int max = arr1[0], min = arr2[0];

        for (int i=0; i<arr1.length && i<arr2.length; i++){

            if (max < arr1[i]){
                max = arr1[i];
            }

            if (min > arr2[i]){
                min = arr2[i];
            }

        }

        System.out.println("Max : "+max);
        System.out.println("Min : "+min);

        System.out.println("Product : "+(max * min));
    }
}

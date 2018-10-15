package problems.arrays.batch6;

import java.util.Arrays;

public class TwoElementsWhoseSumIsClosestToZero {
    /*
        Question: An Array of integers is given, both +ve and -ve. You need to find the two elements such that their sum is closest to zero.
     */

    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -80, 85};
//        method1(arr);
          method2(arr);
    }

    static void method1(int[] arr){
        int min_index1 = 0, min_index2 = 1;
        int min_sum = arr[min_index1] + arr[min_index2];

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){

                int sum = arr[i] + arr[j];

                if (Math.abs(min_sum) > Math.abs(sum)){
                    min_sum = sum;
                    min_index1 = i;
                    min_index2 = j;
                }
            }
        }

        System.out.println("The two elements whose sum is closest to zero are "+arr[min_index1]+ " and "+arr[min_index2]);
    }

    static void method2(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int min_l = 0,  min_r = arr.length-1,  l = 0, r=arr.length-1;
        int min_sum = 99999;

        while (l<r){
            int sum = arr[l] + arr[r];

            if (Math.abs(min_sum) > Math.abs(sum)){
                min_sum = sum;
                min_l = l;
                min_r = r;
            }

            if (sum < 0){
                l++;
            }else {
                r--;
            }
        }

        System.out.println("The two elements whose sum is closest to zero are "+arr[min_l]+ " and "+arr[min_r]);
    }
}

package problems.arrays.batch4;

import java.util.Arrays;

public class MoveAllNegElementsToEnd {

    public static void main(String[] args) {
        /* Given an unsorted array of both negative and positive integer.
        The task is place all negative element at the end of array without changing the order of positive element and negative element. */

       int nums[] = {1, -1, 3, 2, -7, -5, 11, 6 };
//       reArrange(nums);
        reArrange2(nums);
    }


    //Approach using 0 as pivot [Relative Order is not maintained]
    public static void reArrange(int[] nums){
        int count = -1;

        for (int i=0; i<nums.length; i++){

            if (nums[i] > 0){
                count++;
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
            }

        }

        System.out.println(Arrays.toString(nums));
    }

    //Approach where relative order is maintained but uses temp array
    public static void reArrange2(int[] nums){

        int[] a = new int[nums.length];
        int count = 0;

        for (int i=0; i<nums.length; i++){

            if (nums[i] >= 0){
                a[count++] = nums[i];
            }
        }

        //In case the input array has all +ve OR all -ve numbers
        if (count == 0 || count == nums.length){
            return;
        }

        for (int i=0; i<nums.length; i++) {

            if (nums[i] < 0) {
                a[count++] = nums[i];
            }
        }

        for (int i=0; i<nums.length; i++){
            nums[i] = a[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}

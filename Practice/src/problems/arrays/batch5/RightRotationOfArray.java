package problems.arrays.batch5;

import java.util.Arrays;

public class RightRotationOfArray {
    /*
        Input: arr[] = {1, 2, 3, 4, 5,
                    6, 7, 8, 9, 10}
              k = 3
    Output: 8 9 10 1 2 3 4 5 6 7

    Input: arr[] = {121, 232, 33, 43 ,5}
               k = 2
    Output: 43 5 121 232 33
     */

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5,
                6, 7, 8, 9, 10};
        int k = 3;

        swapArray(nums, 0, nums.length-1);
        swapArray(nums, 0, k-1);
        swapArray(nums, k, nums.length-1);

        System.out.println(Arrays.toString(nums));

    }

    public static void swapArray(int[] nums, int a, int b){

        while (a<b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }

    public static void rightRotation(int[] nums, int k){
        swapArray(nums, 0, nums.length-1);
        swapArray(nums, 0, k-1);
        swapArray(nums, k, nums.length-1);
    }
}

package problems.arrays.batch0;

import java.util.Arrays;

public class ArrayRotationUsingReversalAlgo {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7};
        int d  = 3;

        reverseArray(nums, 0, d-1);
        reverseArray(nums, d, nums.length-1);
        reverseArray(nums, 0, nums.length-1);

        System.out.println(Arrays.toString(nums));

    }

    public static void reverseArray(int[] nums, int start, int end){
        int temp;

        while (start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

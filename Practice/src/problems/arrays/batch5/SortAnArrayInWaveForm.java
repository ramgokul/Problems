package problems.arrays.batch5;

import java.util.Arrays;

public class SortAnArrayInWaveForm {

    public static void main(String[] args) {
//        int nums[] = {10, 90, 49, 2, 1, 5, 23};
        int nums[] = {1,2,3,4,5,6,7,8,9};
        sortArray(nums);

    }

    public static void swapNumbers(int[] nums, int start, int end){
        int temp  = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void sortArray(int[] nums){
        for (int i = 0; i < nums.length; i+=2)
        {
            // If current even element is smaller
            // than previous
            if (i>0 && nums[i] < nums[i-1] )
                swapNumbers(nums, i-1, i);

            // If current even element is smaller
            // than next
            if (i<nums.length-1 && nums[i] < nums[i+1] )
                swapNumbers(nums, i, i + 1);
        }

        System.out.println(Arrays.toString(nums));
    }
}

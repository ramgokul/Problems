package problems.arrays.batch1;

import java.util.Arrays;

public class removeDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4,4,4,5};

        int index = 0;

        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] != nums[i+1]){
                nums[index++] = nums[i];
            }
        }
        nums[index++] = nums[nums.length - 1];

        while (index < nums.length){
            nums[index++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}

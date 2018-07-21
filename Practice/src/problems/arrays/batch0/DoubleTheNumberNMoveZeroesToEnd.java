package problems.arrays.batch0;

import java.util.Arrays;

public class DoubleTheNumberNMoveZeroesToEnd {

    public static void main(String[] args) {
        int[] nums = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        rearrange(nums);
    }

    public static void rearrange(int[] nums){

        for (int i=0; i<nums.length-1; i++){
            if (nums[i] != 0 && nums[i] == nums[i+1]){
                int temp = nums[i];
                nums[i] = 2 * temp;
                nums[i+1] = 0;
            }
        }

        int count = -1;

        for (int i=0; i<nums.length; i++){

            if (nums[i] > 0){
                count++;
                int temp2 = nums[count];
                nums[count] = nums[i];
                nums[i] = temp2;
            }
        }

        System.out.println(Arrays.toString(nums));;
    }
}

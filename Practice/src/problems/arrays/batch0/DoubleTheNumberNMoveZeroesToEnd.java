package problems.arrays.batch0;

import java.util.Arrays;

public class DoubleTheNumberNMoveZeroesToEnd {
    /*
        Given an array of integers of size n. Assume ‘0’ as invalid number and all other as valid number. Convert the array in such a way that if next valid number is same as current number, double its value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are shifted to the end.

        Examples:

        Input : arr[] = {2, 2, 0, 4, 0, 8}
        Output : 4 4 8 0 0 0

        Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
        Output :  4 2 12 8 0 0 0 0 0 0
     */

    public static void main(String[] args) {
        int[] nums = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        rearrange2(nums);
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

    public static void rearrange2(int[] nums){

        if (nums.length == 1){
            return;
        }


        for (int i=0; i<nums.length-1; i++){

            if ((nums[i] !=0) && (nums[i] == nums[i+1])){
                nums[i] = 2 * nums[i];
                nums[i+1] = 0;
                i+= 1;
            }


        }

        int count = 0;

        for (int i=0; i<nums.length; i++){
            if (nums[i] > 0){
                nums[count++] = nums[i];
                nums[i] = 0;
            }
        }

//        while (count < nums.length){
//            nums[count] = 0;
//        }

        System.out.println(Arrays.toString(nums));
    }
}

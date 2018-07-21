package problems.arrays.batch5;

import java.util.Arrays;

public class SegregateEvenOddNumbers {

    public static void main(String[] args) {
        //All the even numbers should be present first, and then the odd numbers.
        int[] nums = {1, 3, 2, 4, 7, 6, 9, 10};
        segregateNumbers(nums);
    }

    public static void segregateNumbers(int[] nums){
        int count = -1;
        int temp = 0;

        for (int i=0; i<nums.length; i++){

            if (nums[i] % 2 == 0){
                count++;
                temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}

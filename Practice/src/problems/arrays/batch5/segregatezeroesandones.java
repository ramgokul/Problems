package problems.arrays.batch5;

import java.util.Arrays;

public class segregatezeroesandones {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

        int index = -1;

        for (int i=0; i<nums.length; i++){

            if (nums[i] == 0){
                index++;
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

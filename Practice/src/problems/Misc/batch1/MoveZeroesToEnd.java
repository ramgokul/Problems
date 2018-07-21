package problems.Misc.batch1;

import java.util.Arrays;

public class MoveZeroesToEnd {

    public static void main(String[] args) {

        int[] numbers = {0, 1, 0, 3, 12};
//        moveZeroes(numbers);
          moveZeroesToEnd(numbers);
    }

    public static void moveZeroes(int[] nums){
        int numPos = 0;

        if (nums == null || nums.length == 0){
            return;
        }

        for (int num : nums){
            if (num != 0){
                nums[numPos++] = num;
            }
            System.out.println(Arrays.toString(nums));
        }

        System.out.println(numPos);

        while (numPos < nums.length){
            nums[numPos++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroesToEnd(int[] nums){
        int count=-1,temp = 0;

        for (int i=0; i<nums.length; i++){

            if ((nums[i] != 0)) {
                count++;
                temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
//                count += 1;
            }

        }

        System.out.println(Arrays.toString(nums));
    }
}

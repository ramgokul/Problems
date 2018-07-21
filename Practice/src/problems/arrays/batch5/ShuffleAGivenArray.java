package problems.arrays.batch5;

import java.util.Arrays;
import java.util.Random;

public class ShuffleAGivenArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        shuffleArray(nums);
    }

    public static void shuffleArray(int[] nums){
        Random r = new Random();

        for (int i=nums.length-1; i>0; i--){
            int j = r.nextInt(i);

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}

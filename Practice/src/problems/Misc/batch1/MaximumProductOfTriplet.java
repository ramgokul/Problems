package problems.Misc.batch1;

import java.util.Arrays;

public class MaximumProductOfTriplet {

    public static void main(String[] args) {
        int[] nums = {-10, -3, -5, -6, -20};
        System.out.println(maxProductOfTrip(nums));

    }

    public static int maxProductOfTrip(int[] nums){

        if (nums.length < 3){
            return -1;
        }

        Arrays.sort(nums);
        System.out.println("Sorted Array : "+Arrays.toString(nums));

        int a = nums[0] * nums[1] * nums[nums.length-1];
        int b = nums[nums.length-3] * nums[nums.length-2] * nums[nums.length-1];

        return Math.max(a,b);
    }
}

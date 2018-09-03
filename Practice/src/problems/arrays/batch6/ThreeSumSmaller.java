package problems.arrays.batch6;

import java.util.Arrays;

public class ThreeSumSmaller {

    public static void main(String[] args) {
        int[] nums = {5, 1, 3, 4, 7};
        threeSumSmaller(nums, 12);
    }

    public static int threeSumSmaller(int[] nums, int target){
        int count  = 0;

        Arrays.sort(nums);

        for (int i=0; i<nums.length-2; i++){
            int start = i+1;
            int end = nums.length-1;

            while (start < end) {
                if (nums[i] + nums[start] + nums[end] < target) {
                    System.out.println(""+nums[i]+","+nums[start]+","+nums[end]);
                    count += end - start;
                    start++;
                } else {
                    end--;
                }
            }
        }

        System.out.println("Count : "+count);
        return count;
    }
}

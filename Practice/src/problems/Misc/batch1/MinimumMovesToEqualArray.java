package problems.Misc.batch1;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class MinimumMovesToEqualArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1};

        System.out.println(minMoves2(nums));


    }

    public static int minMoves(int[] nums) {
        if (nums.length == 0) return 0;
        int min = nums[0];
        for (int n : nums){
            min = Math.min(min, n);
        }
        int res = 0;
        for (int n : nums){
            res += n - min;
        }

        return res;
    }

    public static int minMoves2(int[] nums){
        int arraySum = 0;
        int arrayMin = nums[0];

        for(int n : nums){
            arraySum += n;
            arrayMin = Math.min(arrayMin, n);
        }

        System.out.println("Sum : "+arraySum);
        System.out.println("Min : "+arrayMin);

        return (arraySum - (nums.length * arrayMin));

    }

//    public static int minMoves3(int[] nums){
//        int[] nums2 = Arrays.copyOf(nums, nums.length);
//        int[] tempArray =
//    }
}

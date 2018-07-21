package problems.Misc.batch3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumEqualToGivenNumberInArray {
    public static void main(String[] args) {
//        int[] nums = {10, 9, 5, 9, 0, 10, 2, 10, 1, 9};
        int[] nums = {11, 15, 6, 8, 9, 10};
//        Arrays.sort(nums);

        returnNumbers2(nums, 16);

    }

    public static void returnNumbers(int[] nums, int sum) {
        int target = 0;

        for (int n : nums) {
            if (Arrays.binarySearch(nums, sum - n) > 0) {
                System.out.println("Matching numbers are " + n + " and " + (sum - n));
                System.out.println();
            }
        }
    }

    public static void returnNumbers2(int[] nums, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {

            if (!set.contains(sum - n)) {
                set.add(n);
            } else {
                System.out.println("Matching numbers are " + n + " and " + (sum - n));
            }

        }

        System.out.println(set);
    }
}

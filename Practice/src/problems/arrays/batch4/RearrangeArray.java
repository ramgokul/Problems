package problems.arrays.batch4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RearrangeArray {
    /* Rearrange an array such that arr[i] = i
    Given an array of elements of length N, ranging from 1 to N. All elements may not be present in the array.
    If element is not present then there will be -1 present in the array.
    Rearrange the array such that A[i] = i and if i is not present, display -1 at that place. */

    public static void main(String[] args) {
        int[] nums = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        fixArrayPos(nums);
    }

    public static void fixArrayPos(int[]  nums){
        Set<Integer> set = new HashSet<>();

        for (int n : nums){
            set.add(n);
        }

        for (int i=0; i<nums.length; i++){
            if (set.contains(i)){
                nums[i] = i;
            }else{
                nums[i] = -1;
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}

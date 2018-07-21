package problems.Misc.batch1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumbersInArray {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(returnMissingNumbers2(nums));
    }


    public static List<Integer> returnMissingNumbers(int[] nums){
        List<Integer> ret = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }

    public static int returnMissingNumbers2(int[] nums){
        Set<Integer> set = new HashSet<>();

        for (int n : nums){
            set.add(n);
        }

        for (int i = 0; i <= nums.length; i++){
            if (!set.contains(i)){
                return i;
            }
        }

        return -1;
    }
}

package problems.arrays.batch6;

import java.util.HashSet;
import java.util.Set;

public class TripletsThatSumToGivenValue {
    public static void main(String[] args) {
        int[] nums = {12, 3, 4, 1, 6, 9};
        triplets(nums, 24);
    }

    public static boolean triplets(int[] nums, int value){
//        boolean b;
        int sum;
        Set<Integer> set = new HashSet<>();

//        for (int n : nums){
//            set.add(n);
//        }

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; i<nums.length; j++){

                sum = nums[i] + nums[j];
                if (set.contains(value - sum)){
                    System.out.println("Triplets are "+(value-sum)+ ","+nums[i]+ ","+nums[j]);
                    return true;
                }else {
                    set.add(nums[j]);
                }
            }
        }
        return false;
    }
}

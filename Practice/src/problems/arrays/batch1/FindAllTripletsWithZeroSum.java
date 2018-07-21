package problems.arrays.batch1;

import java.util.HashSet;
import java.util.Set;

public class FindAllTripletsWithZeroSum {

    public static void main(String[] args) {
        int[] nums = {0, -1, 2, -3, 1};
        triplets(nums);
    }


    public static void triplets(int[] nums){
        Set<Integer> set = new HashSet<>();
        int sum;

//        for (int n : nums){
//            set.add(n);
//        }

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                sum = -(nums[i] + nums[j]);

                if (set.contains(sum)){
                    System.out.println("Numbers are "+nums[i]+","+nums[j]+","+sum);
                    break;
                }else {
                    set.add(nums[j]);
                }
            }
        }

//        System.out.println(Arrays.toString(nums));
    }
}

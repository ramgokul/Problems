package problems.arrays.batch3;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        returnMajorityElement(nums);
    }
    
    public static void returnMajorityElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length / 2;

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);

            if (map.get(n) > size){
                System.out.println("Majority element : "+n);
                return;
            }
        }

        System.out.println("No Majority element found");
    }
}

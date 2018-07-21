package problems.Misc.batch3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        returnSingleNumber(arr);

    }

    public static void returnSingleNumber(int[] nums){
        Set<Integer> set = new HashSet<>();

        for (int n : nums){
            if (set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
        }

        System.out.println(set);

    }
}

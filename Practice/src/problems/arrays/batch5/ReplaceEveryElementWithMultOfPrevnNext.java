package problems.arrays.batch5;

import java.util.Arrays;

public class ReplaceEveryElementWithMultOfPrevnNext {

    /*
    Given an array of integers, update every element with multiplication of previous and next elements with following exceptions.
        a) First element is replaced by multiplication of first and second.
        b) Last element is replaced by multiplication of last and second last.

        Input: arr[] = {2, 3, 4, 5, 6}
        Output: arr[] = {6, 8, 15, 24, 30}

        We get the above output using following
        arr[] = {2*3, 2*4, 3*5, 4*6, 5*6}

     */

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        reArrange(arr);
    }

    public static void reArrange(int[] nums){
        int previous = nums[0];
        nums[0] = nums[0] * nums[1];

        for (int i=1; i<nums.length-1; i++){
            int current = nums[i];
            nums[i] = previous * nums[i+1];
            previous = current;
        }

        nums[nums.length-1] = previous * nums[nums.length-1];

        System.out.println(Arrays.toString(nums));
    }
}

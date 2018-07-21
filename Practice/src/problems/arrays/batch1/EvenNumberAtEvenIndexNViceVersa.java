package problems.arrays.batch1;

import java.util.Arrays;

public class EvenNumberAtEvenIndexNViceVersa {

    public static void main(String[] args) {
        /* Given an array of size n containing equal number of odd and even numbers. The problem is to arrange the numbers in such a way that all the even numbers get the even index and odd numbers get the odd index. Required auxiliary space is O(1).*/
        int arr[] = { 3, 6, 12, 1, 5, 8 };
        reArrange(arr);
    }

    public static void reArrange(int[] nums){
        int evenIndex = 0, oddIndex = 1;

        while (true){

            while (evenIndex < nums.length && nums[evenIndex] % 2 ==0){
                evenIndex += 2;
            }

            while (oddIndex < nums.length && nums[oddIndex] % 2 == 1){
                oddIndex += 2;
            }

            if (evenIndex < nums.length && oddIndex < nums.length){
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[oddIndex];
                nums[oddIndex] = temp;
            } else {
                break;
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}

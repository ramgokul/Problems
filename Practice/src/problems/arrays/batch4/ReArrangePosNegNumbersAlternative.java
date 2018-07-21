package problems.arrays.batch4;

import java.util.Arrays;

public class ReArrangePosNegNumbersAlternative {

    public static void main(String[] args) {
//        int[] nums = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int[] nums = {-1, 3, -5, 6, 3, 6, -7, -4, -9, 10};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        reArrange2(nums);
    }

    public static void reArrange(int[] nums){
        int temp = 0;
        int i = -1;
        int n = nums.length;

        for (int j=0; j<nums.length; j++){

            if (nums[j] < 0){
                i++;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));

        int pos = i+1, neg = 0;

        while (pos < n && neg < pos && nums[neg] < 0)
        {
            temp = nums[neg];
            nums[neg] = nums[pos];
            nums[pos] = temp;
            pos++;
            neg += 2;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void reArrange2(int[] nums){
        int posIndex = 0, negIndex = 1;

        while (true){

            if (posIndex < nums.length && nums[posIndex] >= 0){
                posIndex +=2;
            }

            if (negIndex < nums.length && nums[negIndex] <= 0){
                negIndex += 2;
            }

            if (posIndex < nums.length && negIndex < nums.length){
                int temp = nums[posIndex];
                nums[posIndex] = nums[negIndex];
                nums[negIndex] = temp;
            }else {
                break;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

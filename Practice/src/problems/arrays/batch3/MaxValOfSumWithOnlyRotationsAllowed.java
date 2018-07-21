package problems.arrays.batch3;

public class MaxValOfSumWithOnlyRotationsAllowed {
    /*Given an array, only rotation operation is allowed on array. We can rotate the array as many times as we want.
    Return the maximum possbile of summation of i*arr[i].*/



    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        returnMaxVal(nums);
    }

    public static void returnMaxVal(int[] nums){
        int arrSum = 0;
        int currVal = 0;
        int arrSize = nums.length;

        for (int i=0; i<arrSize; i++){
            arrSum += nums[i];
            currVal += i * nums[i];
        }

        int maxVal = currVal;

        for (int j=1; j<arrSize; j++){
            currVal += arrSum - arrSize * nums[arrSize-j];

            if (currVal > maxVal){
                maxVal = currVal;
            }
        }

        System.out.println(maxVal);
    }
}

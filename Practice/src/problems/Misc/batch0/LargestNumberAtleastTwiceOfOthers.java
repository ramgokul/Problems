package problems.Misc.batch0;

public class LargestNumberAtleastTwiceOfOthers {

    public static void main(String[] args) {

        int[] nums = {3, 6, 1, 0};
        System.out.println(returnLargestNumberIndex(nums));

    }

    public static int returnLargestNumberIndex(int[] nums){
        int maxIndex = 0;

        for (int i=0; i <nums.length; i++){

            if (nums[i] > nums[maxIndex]){
                maxIndex = i;
            }

        }

        for (int i = 0; i < nums.length; i++){
            if (i != maxIndex && nums[maxIndex] < 2 * nums[i]){
                return -1;
            }
        }

        return maxIndex;
    }
}

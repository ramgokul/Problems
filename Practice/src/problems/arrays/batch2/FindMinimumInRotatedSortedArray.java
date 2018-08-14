package problems.arrays.batch2;

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {5, 6, 1, 2, 3, 4};
        System.out.println(returnMinimum(nums));;
//        returnMin(nums);
    }

    public static int returnMinimum(int[] nums){
        int min = nums[0];

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;

            if (nums[right] < nums[mid])
                left = mid + 1;
            else if (mid > left && nums[mid - 1] < nums[mid])
                right = mid - 1;
            else {
                min = nums[mid];
                break;
            }
        }

        return min;
    }

    static void returnMin(int[] nums){

        for (int i=0; i<nums.length-1; i++){

            if (nums[i] > nums[i+1]){
                System.out.println("Mimimum element : "+nums[i+1]);
                return;
            }
        }

        System.out.println("No min element found");
    }
}

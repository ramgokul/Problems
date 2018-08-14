package problems.arrays.batch2;

public class FindRotationCountInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {15, 18, 2, 3, 6, 12};
//        int[] nums = {7, 9, 11, 12, 15};
        returnRotationCount(nums);
    }

    public static void returnRotationCount(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right - left)/2;

            if (nums[right] < nums[mid]){
                left = mid + 1;
            }else if (mid > left && nums[mid-1] < nums[mid]){
                right = mid - 1;
            }else{
                System.out.println("Rotation Count : "+mid);
                break;
            }
        }
    }
}

package problems.Misc.batch2;

public class SearchElementInSortedArray {

    public static void main(String[] args) {
        int[] nums = {10,22,33,44,78};
        System.out.println(returnIndex(nums, 44));

    }

    public static int returnIndex(int[] nums, int key){

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;

            if (nums[mid] == key) {
                return mid;
            }

            if (key > nums[mid] && key <= nums[right]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }

            if (key >= nums[left] && key < nums[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return nums[left] == key ? left : -1;

    }
}

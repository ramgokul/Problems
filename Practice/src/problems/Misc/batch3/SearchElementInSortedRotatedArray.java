package problems.Misc.batch3;

public class SearchElementInSortedRotatedArray {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(returnIndex(nums, 2));

    }

    public static int returnIndex(int[] nums, int key){

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;

            if (nums[mid] == key) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {

                if (key >= nums[left] && key < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {

                if (key > nums[mid] && key <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return nums[left] == key ? left : -1;

    }
}

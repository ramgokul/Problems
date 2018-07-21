package problems.arrays.batch3;

public class LargestThreeElementsInAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        findElements2(arr,3);
    }

    public static void findElements(int[] nums, int k){
        int first = Integer.MIN_VALUE;
        int second = first, third = first;

        if (nums.length < 3){
            return;
        }

        for (int i=0; i<nums.length; i++){

            if (nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }else if (nums[i] > second){
                third = second;
                second = nums[i];
            }else if (nums[i] > third){
                third = nums[i];
            }

        }

        System.out.println("Numbers are "+first+ ","+second+ ","+third);

    }

    public static void findElements2(int[] nums, int k){
        int first = Integer.MAX_VALUE;
        int second = first, third = first;

        if (nums.length < 3){
            return;
        }

        for (int i=0; i<nums.length; i++){

            if (nums[i] < first){
                third = second;
                second = first;
                first = nums[i];
            }else if (nums[i] < second){
                third = second;
                second = nums[i];
            }else if (nums[i] < third){
                third = nums[i];
            }

        }

        System.out.println("Numbers are "+first+ ","+second+ ","+third);

    }
}

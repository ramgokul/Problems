package problems.arrays.batch1;

public class ElementsInArrayHavingAtleast2GreaterELEments {
    /*
    Given an array of n distinct elements, the task is to find all elements in array which have at-least two greater elements than themselves.

        Examples :

        Input : arr[] = {2, 8, 7, 1, 5};
        Output : 2  1  5
        The output three elements have two or
        more greater elements

        Input  : arr[] = {7, -2, 3, 4, 9, -1};
        Output : -2  3  4 -1
     */

    public static void main(String[] args) {
        int arr[] = {2, 8, 7, 1, 5};
        abc(arr);
    }

    public static void abc(int[] nums){
        int first = Integer.MIN_VALUE, second = first;

        if (nums.length < 2){
            return;
        }

        for (int i=0; i<nums.length; i++){
            if (nums[i] > first){
                second = first;
                first = nums[i];
            }else if (nums[i] > second){
                second = nums[i];
            }
        }

        System.out.println("Second largest element : "+second);

        for (int n : nums){
            if (n < second){
                System.out.print(n + " ");
            }
        }
    }
}

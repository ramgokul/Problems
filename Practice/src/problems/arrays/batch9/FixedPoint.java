package problems.arrays.batch9;

public class FixedPoint {

    /*
        Given an array of n distinct integers sorted in ascending order, write a function that returns a Fixed Point in the array, if there is any Fixed Point present in array, else returns -1. Fixed Point in an array is an index i such that arr[i] is equal to i. Note that integers in array can be negative.

        Examples:

          Input: arr[] = {-10, -5, 0, 3, 7}
          Output: 3  // arr[3] == 3

          Input: arr[] = {0, 2, 5, 8, 17}
          Output: 0  // arr[0] == 0


          Input: arr[] = {-10, -5, 3, 4, 7, 9}
          Output: -1  // No Fixed Point

          Method 2 (Binary Search)
          First check whether middle element is Fixed Point or not. If it is, then return it; otherwise check whether index of middle element is greater than value at the index. If index is greater, then Fixed Point(s) lies on the right side of the middle point (obviously only if there is a Fixed Point). Else the Fixed Point(s) lies on left side.
     */

    public static void main(String[] args) {
        int arr[] = {-10, -5, 3, 4, 7, 9};

        for (int i=0; i<arr.length; i++){
            if (i == arr[i]){
                System.out.println("Fixed point : "+i);
                return;
            }
        }

        System.out.println("Fixed point : -1");
    }
}

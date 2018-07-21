package problems.arrays.batch6;

public class FindFloorAndCeilingOfArray {

    /*
        Given a sorted array and a value x, the ceiling of x is the smallest element in array greater than or equal to x,
        and the floor is the greatest element smaller than or equal to x.
        Assume than the array is sorted in non-decreasing order. Write efficient functions to find floor and ceiling of x.

        Examples :

        For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
        For x = 0:    floor doesn't exist in array,  ceil  = 1
        For x = 1:    floor  = 1,  ceil  = 1
        For x = 5:    floor  = 2,  ceil  = 8
        For x = 20:   floor  = 19,  ceil doesn't exist in array
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int n = arr.length - 1;
//        System.out.println(findCeiling(arr,0, n, 5));
        System.out.println(findFloor(arr, 0, n, 0));
    }

    public static int findCeiling(int[] a, int low, int high, int x){

        if (a[low] >= x){
            return a[low];
        }else if (x > a[high]){
            return -1;
        }

        int mid = low + (high-low)/2;

        if (a[mid] == x){
            return a[mid];
        }else if (mid > 0 && (a[mid+1] > x && x > a[mid])){
            return a[mid+1];
        }else if (x < a[mid]){
            return findCeiling(a, low, mid-1, x);
        }else if (x > a[mid]){
            return findCeiling(a, low+1, high, x);
        }

        return -1;

    }

    public static int findFloor(int[] a, int low, int high, int x){

        if (low > high){
            return -1;
        }else if (a[high] <= x){
            return a[high];
        }

        int mid = low + (high - low)/2;

        if (a[mid] == x){
            return a[mid];
        }else if (mid > 0 && (a[mid-1] < x) && a[mid] > x){
            return a[mid-1];
        }else if (a[mid] < x){
            return findFloor(a, mid+1, high, x);
        }else if (a[mid] > x){
            return findFloor(a, low, mid-1, x);
        }

        return -1;
    }
}

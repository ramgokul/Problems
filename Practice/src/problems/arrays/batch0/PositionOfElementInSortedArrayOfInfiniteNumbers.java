package problems.arrays.batch0;

public class PositionOfElementInSortedArrayOfInfiniteNumbers {

    /*
        Find position of an element in a sorted array of infinite numbers
        Suppose you have a sorted array of infinite numbers, how would you search an element in the array?

        Source: Amazon Interview Experience.

        Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array.
        If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.

        Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
        ->if it is greater than high index element then copy high index in low index and double the high index.
        ->if it is smaller, then apply binary search on high and low indices found.
     */

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};
        findBoundary(arr, 100);
    }

    public static void findBoundary(int[] a, int key){
        int low = 0, high = 1;
        int value = a[low];

        while (value < key){
            low = high;
            high = 2 * high;
            value = a[high];
        }

        System.out.println("Low : "+low+ ", High : "+high);
        binarySearch(a, low, high, key);
    }

    public static void binarySearch(int[] a, int low, int high, int key){

        while (low <= high){
            int mid = low + (high-low)/2;

            if (a[mid] == key){
                System.out.println("Element index is "+mid);
                return;
            }else if (a[mid] > key){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
    }
}

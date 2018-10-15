package problems.arrays.batch10;

public class CountInversions {
    /*
        Inversion Count for an array indicates – how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
        Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j

        Example:
        The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
     */

    public static void main(String[] args) {
        int[] arr = { 1, 20, 6, 4, 5 };
        int inv_count = 0;

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    inv_count++;
                }
            }
        }

        System.out.println("Inversion count : "+inv_count);
    }
}

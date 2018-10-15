package problems.arrays.batch11;

public class PairsWithSumLessThank {

    /*
        Given a sorted integer array and number x, the task is to count pairs in array whose sum is less than x.

        Examples:

        Input  : arr[] = {1, 3, 7, 9, 10, 11}
                 x = 7
        Output : 1
        There is only one pair (1, 3)

        Input  : arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
                 x = 7
        Output : 6
        Pairs are (1, 2), (1, 3), (1, 4), (1, 5)
                  (2, 3) and (2, 4)
     */

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}, x = 7;
        int start = 0, end = arr.length-1, count = 0;

        while (start < end){
            if (arr[start] + arr[end] < x){
                count += end - start;
                start++;
            }else {
                end--;
            }
        }

        System.out.println("Pair count : "+count);

    }
}

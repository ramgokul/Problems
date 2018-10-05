package problems.arrays.batch9;

public class ArraySearchWhereAdjacentDifferByK {

    /*
        A step array is an array of integer where each element has a difference of atmost k with its neighbor. Given a key x, we need to find the index value of k if multiple element exist return the first occurrence of key.

        Examples:

        Input : arr[] = {4, 5, 6, 7, 6}
                   k = 1
                   x = 6
        Output : 2
        The first index of 6 is 2.

        Input : arr[] = {20, 40, 50, 70, 70, 60}
                  k = 20
                  x = 60
        Output : 5
        The index of 60 is 5

        A Simple Approach is to traverse the given array one by one and compare every element with given element ‘x’. If matches, then return index.

        The above solution can be Optimized using the fact that difference between all adjacent elements is at most k. The idea is to start comparing from the leftmost element and find the difference between current array element and x. Let this difference be ‘diff’. From the given property of array, we always know that x must be at-least ‘diff/k’ away, so instead of searching one by one, we jump ‘diff/k’

     */

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 6};
        int k = 1 , x = 7;
        int n = arr.length;

        int i = 0;

        while (i<n){

            if (arr[i] == x){
                System.out.println("Element "+x+ " found");
                return;
            }

            i = i + Math.max(1, Math.abs((arr[i] - x)/k)) ;
        }
    }
}

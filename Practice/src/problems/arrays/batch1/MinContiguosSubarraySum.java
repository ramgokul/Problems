package problems.arrays.batch1;

public class MinContiguosSubarraySum {

    public static void main(String[] args) {
//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int arr[] = {3, -4, 2, -3, -1, 7, -5};
        method2(arr);
    }

    public static void method2(int A[]){
        // to store the minimum value that is
        // ending up to the current index
        int min_ending_here = 2147483647;

        // to store the minimum value encountered
        // so far
        int min_so_far = 2147483647;

        int n = A.length;

        // traverse the array elements
        for (int i = 0; i < n; i++)
        {

            // if min_ending_here > 0, then it could
            // not possibly contribute to the
            // minimum sum further
            if (min_ending_here > 0)
                min_ending_here = A[i];

                // else add the value arr[i] to
                // min_ending_here
            else
                min_ending_here += A[i];

            // update min_so_far
            min_so_far = Math.min(min_so_far,
                    min_ending_here);
        }

        System.out.println("Min Sum : "+min_so_far);
    }

}

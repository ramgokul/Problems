package problems.arrays.batch2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class kthSmallestElement {

    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k =3;
        returnSmallest(arr,k);
    }

    public static void returnSmallest(int[] arr, int k){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(""+k+ "th largest element : "+ arr[k-1]);
        System.out.println(""+k+ "th largest element : "+ arr[arr.length-k]);
//        for (int i=0; i<=k-1; i++){
//            System.out.print(arr[i]+" ");
//        }
//
//        for (int j=arr.length-k; j<arr.length; j++){
//            System.out.print(arr[j]+" ");
//        }
    }

    public static int returnSmallest2(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : arr){
            pq.offer(n);

            if (pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();
    }
}

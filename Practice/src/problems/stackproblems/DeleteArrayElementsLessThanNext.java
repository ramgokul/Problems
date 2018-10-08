package problems.stackproblems;

import java.util.Stack;

public class DeleteArrayElementsLessThanNext {

    /*
        Given an array arr[] and a number k. The task is to delete k elements which are smaller than next element (i.e., we delete arr[i] if arr[i] < arr[i+1]) or become smaller than next because next element is deleted.

        Examples:

        Input       : arr[] = { 3, 100, 1 }
                      k = 1
        Output      : 100, 1
        Explanation : arr[0] < arr[1] means 3 is less than
                      100, so delete 3

        Input       : arr[] = {20, 10, 25, 30, 40}
                      k = 2
        Output      : 25 30 40
        Explanation : First we delete 10 because it follows
                      arr[i] < arr[i+1]. Then we delete 20
                      because 25 is moved next to it and it
                      also starts following the condition.

        Input       : arr[] = { 23, 45, 11, 77, 18}
                      k = 3
        Output      : 77, 18
        Explanation : We delete 23, 45 and 11 as they follow
                      the condition arr[i] < arr[i+1]
     */

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = {20, 10, 25, 30, 40};

        int count = 0, k = 2;

        s.push(arr[0]);

        for (int i=1; i<arr.length; i++){

            while (!s.isEmpty() && s.peek() < arr[i] && count < k){
                s.pop();
                count++;
            }

            s.push(arr[i]);
        }

        System.out.println(s);


    }
}

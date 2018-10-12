package problems.arrays.batch9;

public class LeadersInAnArray {

    /*
        Write a program to print all the LEADERS in the array.
        An element is leader if it is greater than all the elements to its right side.
        And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
     */

    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        leader_array(a);
    }

    static void leader_array(int[] a){
        int max_so_far = a[a.length-1];
        System.out.println("Leader in array : "+max_so_far);

        for (int i=a.length-2; i>=0; i--){
            if (max_so_far < a[i]){
                max_so_far = a[i];
                System.out.println("Leader in array : "+max_so_far);
            }
        }
    }
}

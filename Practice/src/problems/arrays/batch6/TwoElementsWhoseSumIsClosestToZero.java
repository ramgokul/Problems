package problems.arrays.batch6;

public class TwoElementsWhoseSumIsClosestToZero {
    /*
        Question: An Array of integers is given, both +ve and -ve. You need to find the two elements such that their sum is closest to zero.
     */

    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -80, 85};

        int min_index1 = 0, min_index2 = 1;
        int min_sum = arr[min_index1] + arr[min_index2];

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){

                int sum = arr[i] + arr[j];

                if (Math.abs(min_sum) > Math.abs(sum)){
                    min_sum = sum;
                    min_index1 = i;
                    min_index2 = j;
                }
            }
        }

        System.out.println("The two elements whose sum is closest to zero are "+arr[min_index1]+ " and "+arr[min_index2]);
    }
}

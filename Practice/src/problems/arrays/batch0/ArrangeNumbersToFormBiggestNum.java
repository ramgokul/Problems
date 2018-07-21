package problems.arrays.batch0;

public class ArrangeNumbersToFormBiggestNum {
    /*Given an array of numbers, arrange them in a way that yields the largest value.
    For example, if the given numbers are {54, 546, 548, 60}, the arrangement 6054854654 gives the largest value*/

    public static void main(String[] args) {
        String[] nums = {"54", "546", "548", "60"};
        reArrangeNumbers(nums);
    }

    public static void reArrangeNumbers(String[] arr){

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){

                String num1 = arr[i] + arr[j];
                String num2 = arr[j] + arr[i];

                if (num1.compareTo(num2) < 0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }


        System.out.println(String.join("", arr));
    }
}

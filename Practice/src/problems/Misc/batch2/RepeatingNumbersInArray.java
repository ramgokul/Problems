package problems.Misc.batch2;

import java.util.ArrayList;
import java.util.List;

public class RepeatingNumbersInArray {

    public static void main(String[] args) {

        int[] nums = {4, 2, 4, 5, 2, 3, 1};
        System.out.println(returnRepeatedNumbers(nums));

    }

    public static List<Integer> returnRepeatedNumbers(int[] arr){
        List<Integer> list1 = new ArrayList<>();
        int value = 0;

        for (int i = 0; i < arr.length; i++){
            value = Math.abs(arr[i]) ;

            if (arr[value] > 0) {
                arr[value] = -arr[value];
            }else{
                list1.add(value);
            }
        }

        return list1;
    }
}

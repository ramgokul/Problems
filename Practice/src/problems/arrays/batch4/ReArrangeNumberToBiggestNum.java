package problems.arrays.batch4;

import java.util.Arrays;
import java.util.Collections;

public class ReArrangeNumberToBiggestNum {

    public static void main(String[] args) {
        int num = 123456789;

        char[] chars = (String.valueOf(num)).toCharArray();

        for (int i=0; i<chars.length; i++){
            for (int j=i+1;  j<chars.length; j++){

                String first = String.valueOf(chars[i]) +String.valueOf(chars[j]);
                String second = String.valueOf(chars[j]) +String.valueOf(chars[i]);

                if (first.compareTo(second) < 0){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }

        int i = Integer.parseInt(new String(chars));
        System.out.println(i);


    }
}

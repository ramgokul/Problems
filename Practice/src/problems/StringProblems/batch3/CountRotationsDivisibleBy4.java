package problems.StringProblems.batch3;

public class CountRotationsDivisibleBy4 {

    /*
        Given a large positive number as string, count all rotations of the given number which are divisible by 4.

        Examples:

        Input: 8
        Output: 1

        Input: 20
        Output: 1
        Rotation: 20 is divisible by 4
                  02 is not divisible by 4

        Input : 13502
        Output : 0
        No rotation is divisible by 4

        Input : 43292816
        Output : 5
        5 rotations are : 43292816, 16432928, 81643292
                          92816432, 32928164


        Solution:

        For large numbers it is difficult to rotate and divide each number by 4. Therefore, ‘divisibility by 4’ property is used which says that a number is divisible by 4 if the last 2 digits of the number is divisible by 4. Here we do not actually rotate the number and check last 2 digits for divisibility, instead we count consecutive pairs (in circular way) which are divisible by 4.

        Illustration:



        Consider a number 928160
        Its rotations are 928160, 092816, 609281, 160928,
            816092, 281609.
        Now form pairs from the original number 928160
        as mentioned in the approach.
        Pairs: (9,2), (2,8), (8,1), (1,6),
                 (6,0), (0,9)
        We can observe that the 2-digit number formed by the these
        pairs, i.e., 92, 28, 81, 16, 60, 09, are present in the last
        2 digits of some rotation.
        Thus, checking divisibility of these pairs gives the required
        number of rotations.

        Note: A single digit number can directly
        be checked for divisibility.
     */

    public static void main(String[] args) {
        String s = "4834";
        count_rotations(s);
    }

    static int count_rotations(String s){
        int counter = 0, twoDigit=0, i=0;


        if (s.length() == 1){
            int digit = s.charAt(0) - '0';

            if (digit % 4 == 0){
                return 1;
            }

            return 0;
        }

        for (i=0; i<s.length()-1; i++){
             twoDigit = (s.charAt(i) - '0') * 10 + (s.charAt(i+1) - '0');

            if (twoDigit % 4 == 0){
                counter++;
            }
        }

        twoDigit = (s.charAt(i) - '0') * 10 + (s.charAt(0) - '0');

        if (twoDigit % 4 == 0){
            counter++;
        }

        return counter;


    }
}

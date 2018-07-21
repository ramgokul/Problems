package problems.Misc.batch3;

public class SmallestLetterGrterThanTarget {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';

        for (char c : letters) {

            if (c > target) {
                System.out.println("Output : " + c);
                break;
            }

        }
        System.out.println("Output2 : " + letters[0]);
    }
}

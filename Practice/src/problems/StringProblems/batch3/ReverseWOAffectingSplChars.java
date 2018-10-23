package problems.StringProblems.batch3;

public class ReverseWOAffectingSplChars {

    /*
        Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.

        Examples:

        Input:   str = "a,b$c"
        Output:  str = "c,b$a"
        Note that $ and , are not moved anywhere.
        Only subsequence "abc" is reversed

        Input:   str = "Ab,c,de!$"
        Output:  str = "ed,c,bA!$"
     */

    public static void main(String[] args) {

        String str = "Ab,c,de!$";
        char[] arr = str.toCharArray();

        int start = 0, end = str.length()-1;

        while (start < end){

            if (!Character.isAlphabetic(arr[start])){
                start++;
            }else if (!Character.isAlphabetic(arr[end])){
                end--;
            }else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        String new_string = new String(arr);
        System.out.println(new_string);
    }
}

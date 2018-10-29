package problems.StringProblems.batch5;

public class SearchInArrayOfStrings {
    /*
        Given an array of strings. The array has both empty and non-empty strings. All non-empty strings are in sorted order. Empty strings can be present anywhere between non-empty strings.

        Examples:

        Input :  arr[] =  {"for", "", "", "", "geeks",
                           "ide", "", "practice", "" ,
                           "", "quiz", "", ""};
                  str = "quiz"
        Output :   10
        The string "quiz" is present at index 10 in
        given array.

     */

    public static void main(String[] args) {
        String arr[] =  {"for", "", "", "", "geeks",
                "ide", "", "practice", "" ,
                "", "quiz", "", ""};
        String str = "quiz";

        int len = arr.length;
        int first = 0, last = len-1;

//        System.out.println(str.compareTo("ramn"));

        search_str(arr, str, first, last);

    }


    static int search_str(String[] arr, String str, int first, int last){
        int mid = (first + last)/2;


        if (arr[mid].isEmpty()) {

            while (true) {

                int left = mid - 1, right = mid + 1;

                if (right <= last && !arr[right].isEmpty()) {
                    mid = right;
                    break;
                } else if (left >= first && !arr[left].isEmpty()) {
                    mid = left;
                    break;
                } else if (left < first && right > last) {
                    return -1;
                }
                right++;
                left--;
            }
        }

        if (arr[mid] == str){
            System.out.println("String found");
            return mid;
        }

        if (str.compareTo(arr[mid]) > 0){
            return search_str(arr, str, mid+1, last);
        }

//        if (str.compareTo(arr[mid]) > 0){
            return search_str(arr, str, first, mid-1);
//        }
    }
}

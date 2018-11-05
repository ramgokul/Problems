package problems.StringProblems.batch5;

public class ExpandRange {

    /*
        Suppose we have given a String in which some ranges as specified and we have to place the numbers which is between the given range in the specified place as given in the example:

        Examples:

        Input : string x = "1-5, 8, 11-14, 18, 20, 26-29"
        Output : string y = "1, 2, 3, 4, 5, 8, 11, 12,
                            13, 14, 18, 20, 26, 27, 28, 29"
     */

    public static void main(String[] args) {
        String s = "1-5, 8, 11-14, 18, 20, 26-29";
        String[] s1 = s.split(",");

        for (String ind : s1){

            if (ind.contains("-")){

                String[] another = ind.split("-");
                int start = Integer.parseInt(another[0].trim());
                int end = Integer.parseInt(another[1].trim());

                while (start <= end){
                    System.out.print(start + " ");
                    start++;
                }
            } else {
                System.out.print(ind + " ");
            }



        }
    }
}

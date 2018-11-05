package problems.StringProblems.batch6;

public class CheckIfStringCanBecomeEmptyByDeletingSubstring {

    public static void main(String[] args) {
        String str = "GEEGEEKSKS", sub_str = "GEEKS";

        StringBuilder sb = new StringBuilder(str);
        int sub_len = sub_str.length();
        boolean possible = true;

        while (sb.length() > 0){

            int index = sb.indexOf(sub_str);
            if (index == -1){
                possible = false;
                break;
            }

            sb.delete(index, index+sub_len);
        }

        if (possible){
            System.out.println("possible");
        }else {
            System.out.println("Not possible");
        }
    }
}

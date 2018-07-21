package problems.Misc.batch1;

public class MinRotationsReqdToGetSameString {

    public static void main(String[] args) {
        System.out.println(returnMinRotations("geeks"));
    }

    public static int returnMinRotations(String string){
        String temp = string + string;

        for (int i=1; i<=string.length(); i++){
            String subString = temp.substring(i, string.length()+i);

            System.out.println(subString);

            if (subString.equals(string)){
                return i;
            }
        }

        return string.length();
    }
}

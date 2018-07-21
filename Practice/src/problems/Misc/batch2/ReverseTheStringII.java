package problems.Misc.batch2;

public class ReverseTheStringII {

    public static void main(String[] args) {
        reverseString2("Let's take LeetCode contest");

    }

    public static void reverseString(String string){
        char[] arr = string.toCharArray();
        char temp;

        for (int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        String s = new String(arr);
        System.out.println(s);
    }

    public static void reverseString2(String string){
        StringBuilder sb = new StringBuilder();
        String[] words = string.split(" ");

        for (String word : words){
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }

        System.out.println(sb.toString().trim());

    }
}

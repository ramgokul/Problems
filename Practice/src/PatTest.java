import java.util.regex.Pattern;

public class PatTest {

    public static void main(String[] args) {
        System.out.println(Pattern.matches("[abc]+", "abcab"));
    }
}

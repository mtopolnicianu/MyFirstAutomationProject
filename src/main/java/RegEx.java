import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegEx {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Pattern p = Pattern.compile("\\d");

        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        Pattern p2 = Pattern.compile(".s");//. represents single character
        Matcher m = p2.matcher("as");
        boolean b = m.matches();

//2nd way
        boolean b2=Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

//3rd way
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b3);
    }
}

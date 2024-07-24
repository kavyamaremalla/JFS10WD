import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        String matchPattern = "[aA0-zZ9]{3,}@[a-z]{5,7}.[a-z]{2,3}";

        Pattern regex = Pattern.compile(matchPattern);


        String input = "Test123@gmail.com";
        String input1 = "demo345@gmailywtr6.in";

        Matcher matcher = regex.matcher(input1);
//        regex.matcher(input1);

//        System.out.println(matcher.find());

        while (matcher.find()){
            String matchFound = matcher.group();
            System.out.println(matchFound);
            System.out.println(matcher);
        }
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("guvi.in", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("Visit Guvi.in!");

        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("Found the match");
        }else{
            System.out.println("Match is not found");
        }
    }
}

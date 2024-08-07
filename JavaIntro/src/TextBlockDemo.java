import java.util.stream.Collectors;

public class TextBlockDemo {
    public static void main(String[] args) {
        String printWelcome = "Hello, \n Welcome to Course";

//        System.out.println(printWelcome.lines().collect(Collectors.toList()));

//        System.out.println(printWelcome.repeat(4));

        //Text Blocks

        String welcomeNote = """
                Hello,
                    Welcome to the course!
                """;

        System.out.println(welcomeNote.repeat(4));
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

interface Add{
    int add (int number1, int number2);
}



public class LambdaExpDemo1 {

    public static void main(String[] args) {

        //without return
        Add add1 = (a, b) ->  (a + b);
        int result = add1.add(4,5);
        System.out.println(result);

        //With Return KeyWord
        Add add2 = (number1, number2) -> {
             return (number1 + number2);
        };
        System.out.println(add2.add(5,6));
    }
}

class LambdaForEachDemo{
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("John");
        stringList.add("Jill");
        stringList.add("Peter");

//        stringList.forEach(name -> System.out.println(name));

//        stringList.forEach(name -> System.out.println(name.toUpperCase()));

        Stream<String> nameStream = stringList.stream().filter(name -> name.length() > 4);
               nameStream.forEach(System.out::println);

        stringList.stream().filter(name -> name.length() > 4)
                .forEach(result -> System.out.println(result)); // equivalent to line 42 and 43

        Map<Integer, String> studentMap = new HashMap<>();
//        studentMap.entrySet().stream().forEach();

//        studentMap.forEach();

    }
}

@FunctionalInterface
interface SendMessage{
    String send(String message);
}


class LambdaExpMultiStatementsDemo{
    public static void main(String[] args) {

        SendMessage message = (inputMessage) -> {
            String str1 = "Hello";
            String str2 = str1 + " " + inputMessage;

            return str2;

        };
        System.out.println(message.send("World!"));
    }
}


















import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutableCollections {
    public static void main(String[] args) {

        List<String> sportList = new ArrayList<>();

        sportList.add("hockey");
        sportList.add("cricket");

        List<String> unModifiableSportList = Collections.unmodifiableList(sportList);//before Java 9

        System.out.println(unModifiableSportList);

//        unModifiableSportList.add("wrestling");// run-time error

//        sportList.add("kabaddi");

//        System.out.println(sportList);

        List<Integer> numberList = Arrays.asList(6,1,7,2,4,3, null);

//        System.out.println(numberList);

        List<Integer> resultList =
//                numberList.stream()
//                .filter(x -> x %2 == 0).collect(Collectors.toList());
                     numberList.stream()
                        .flatMap(x -> Stream.ofNullable(x))
//                             .filter(x -> x %2 ==0)
                             .collect(Collectors.toList());

        List<Integer> result = numberList.stream().takeWhile(x -> x%2==0).collect(Collectors.toList());
//        System.out.println(result);


        resultList.remove(2);
//        System.out.println(resultList);

        List<Integer> numbers = List.of(1,3,4,5, null); //Immutable list
//        numbers.remove(1);

        System.out.println(numbers);

        Map<Integer, String> map = Map.of(1, "john", 2, "peter"); //immutable map
//        map.put(3, "mary");

        Map<Integer, Integer> numberMap = Map.ofEntries(Map.entry(1, 1111),Map.entry(2,2222));
    }
}

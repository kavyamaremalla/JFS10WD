import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AdvFeatures_V8 {

    public static void main(String[] args) {

//        List<Integer> numberList = new ArrayList<>();
        List<Integer> numberList = Arrays.asList(12,  6, 10, 11, 421);
//        numberList.add(12);
//        numberList.add(10);
//        numberList.add(11);
//        numberList.add(6);
//        numberList.add(421);

        List<Integer> resultList = numberList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList()); //From Java 8
//                     .stream().forEach(input -> System.out.println(input));

//        List<Integer> resultList1 = numberList.stream().filter(num -> num % 2 == 0).toList(); //From Java 16

        Collections.sort(resultList); // sort your list in ascending order

        Collections.sort(resultList, Collections.reverseOrder()); // sort your list in descending order

//        System.out.println(resultList);

        Function<Integer, Integer> squareFunction = i -> i * i;

        List<Integer> squaredEvenList = resultList.stream()
                                                  .map(squareFunction)
                                                  .sorted(Comparator.reverseOrder())
                                                  .collect(Collectors.toList());

//        System.out.println(squaredEvenList);

        Optional<Integer> minvalue = squaredEvenList.stream().min((i, j) -> i-j);
//        if (minvalue.isPresent()){
//            System.out.println(minvalue);
//        }else{
//            System.out.println("No values in list, please check input");
//        }

        Optional<Integer> maxvalue = squaredEvenList.stream().max(Comparator.comparingInt(j -> j));
//        if (minvalue.isPresent()){
//            System.out.println(maxvalue);
//        }else{
//            System.out.println("No values in list, please check input");
//        }

        System.out.println(maxvalue.orElse(0));// checks if list is empty and returns 0 in case list is empty else it returns the value in list
    }
}

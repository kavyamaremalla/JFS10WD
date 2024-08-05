import java.util.function.*;

public class TypesOfFIDemo {
    public static void main(String[] args) {

        Predicate<Integer> isEven = (number) -> number % 2 == 0 && number > 10;
//        boolean result = isEven.negate().test(10);
//        boolean result = isEven.test(10);

//        System.out.println(result);

        Predicate<Integer> gtThan = integer -> integer > 2;
//        System.out.println(gtThan.test(1));
        System.out.println(isEven.and(gtThan).test(2));

    }
}
class FunctionDemo{
    public static void main(String[] args) {
        Function<Integer, String> function = number -> "String " + number ;
//                new Function<Integer, String>() {
//            @Override
//            public String apply(Integer integer) {
//                return null; //logic
//            }
//        };


        String result = function.apply(15);

        System.out.println(result);

        Function<Integer, Integer> square = num -> num * num;
        System.out.println(square.apply(25));
    }
}

class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printMessage = message -> System.out.println(message);
//                new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };

        printMessage.accept("From Consumer");
    }
}

class SupplierDemo{
    public static void main(String[] args) {
        int value = 5;
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 100) + value;
        System.out.println(randomNumber.get());
    }
}

class UnaryDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = num -> num * num;
        System.out.println(square.apply(15));
    }

}
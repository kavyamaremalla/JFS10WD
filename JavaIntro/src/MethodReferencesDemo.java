import java.util.function.BiFunction;

@FunctionalInterface
interface ApplyInterface {
    void apply();

//    void add();

    // int add(int a , int b);
}

public class MethodReferencesDemo {

    public static void doApply(){
        System.out.println("This is a static method");
    }

    public void method1(){
        System.out.println("Inside an instance/non-static method");
    }

    public static void main(String[] args) {
        //refer a static method
        ApplyInterface anApplyInterface = MethodReferencesDemo::doApply;
        anApplyInterface.apply();

       //referring to an instance method
       MethodReferencesDemo demo = new MethodReferencesDemo();
       ApplyInterface anApplyInterface1 = demo::method1;
       anApplyInterface1.apply();

        BiFunction<Integer, Integer, Integer> add = Arithmetic::add; // inbuilt FI
        int result = add.apply(5, 6);
        System.out.println(result);
    }
}

class Arithmetic {
    public static int add (int a , int b){
        return a + b;
    }
}

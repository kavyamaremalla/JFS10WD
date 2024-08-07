public class MethodsInInterface implements IntCalculator, CustomInterface{

    public static void main(String[] args) {
        IntCalculator calculator = new MethodsInInterface();

        System.out.println(calculator.subtract(4, 3));
        System.out.println(calculator.add(1,2));
        System.out.println(IntCalculator.multiply(3,4));

        IntCalculator.method3();
        CustomInterface.method3();

        calculator.method2();
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public void method2() {
//        IntCalculator.super.method2();
//        CustomInterface.super.method2();
        System.out.println("from Int");
    }

    @Override
    public void method1() {

    }


}
@FunctionalInterface
interface IntCalculator{
    int add (int a, int b);

    default int subtract(int a, int b){
      return a - b;
    }

    static int multiply(int a , int b){
        return a * b;
    }


    public default void method2(){

        System.out.println("Default Method ");
    }

    public static void method3(){

        System.out.println("Static Method ");
    }
}
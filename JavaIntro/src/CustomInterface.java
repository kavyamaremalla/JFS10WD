public interface CustomInterface {
    public abstract void method1();

    public default void method2(){
    method4();//pvt method inside a default method
    method5();//pvt static method inside some non-static method
        System.out.println("Default Method ");
    }

    public static void method3(){
        method5();//pvt static method inside a static methods
        System.out.println("Static Method ");
    }

    private void method4(){
        System.out.println("Private Method4");
    }

    private static void method5(){
        System.out.println("Private static method 5");
    }
}

class CustomClass implements CustomInterface{

    @Override
    public void method1() {
        System.out.println("Abstract method");
    }

    public static void main(String[] args) {
        CustomInterface customInterface = new CustomClass();
        customInterface.method1();
//        customInterface.method2();
//        CustomInterface.method3();
    }


}

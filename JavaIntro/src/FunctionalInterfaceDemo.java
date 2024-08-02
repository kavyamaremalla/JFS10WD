import java.lang.annotation.Annotation;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void sleep(); //SAM single abstract method

//    void eat();
}

class DemoFunctionalInterface implements FunctionalInterfaceDemo{

    @Override
    public void sleep() {
        System.out.println("Inside child");
    }

    public static void main(String[] args) {
        DemoFunctionalInterface  object = new DemoFunctionalInterface();
        object.sleep();
    }
}
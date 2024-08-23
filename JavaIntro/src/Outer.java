public class Outer {

    void outerMethod(){
        System.out.println("Outer Method");

        class Inner {
            void innerMethod(){
                System.out.println("Inner Method");
            }
        }

        Inner inner = new Inner();
        inner.innerMethod();
    }

}

class TestOuter{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}

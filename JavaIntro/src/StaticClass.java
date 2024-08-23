public class StaticClass {

    private static String name = "John";

  public static class StaticDemo{ // nested class which is static class
            public void show(){
                System.out.println(name);
            }
  }

    public static void main(String[] args) {
        StaticClass.StaticDemo staticClass = new StaticClass.StaticDemo();
        StaticDemo demo = new StaticDemo();
        staticClass.show();
        demo.show();
    }
}


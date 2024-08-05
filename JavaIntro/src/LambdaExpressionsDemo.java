public class LambdaExpressionsDemo {
    public static void main(String[] args) {

        int height = 10;

        Drawable drawable = new Drawable() {
            @Override
            public void draw(int a, String b) {
                System.out.println("Drawing with height of " + height );
            }
        };

//        drawable.draw();

        //With Lambda, anonymous name function
        Drawable drawable1 = (a, b) -> {
            System.out.println("Drawing inside lambda " + height + " Value of a is " + a);
        };

        drawable1.draw(7, "second parameter");
    }
}

interface Drawable {
     void draw(int a, String b);
}

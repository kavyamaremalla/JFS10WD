import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {
        int x = 10;

        System.out.println(12/0);
        int[] numbers = {1,2,3,4,5};

        try {
            System.out.println(numbers[5]);
//            System.out.println(x/0);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Program stopped due to an error" + e.getMessage());
        }
       /* catch (ArithmeticException e1){
            System.out.println("Program stopped due to an error" + e1.getMessage());
        }*/finally {
            System.out.println("try-catch finished here");
        }

//        try {
//            System.out.println(numbers[8]);
//            System.out.println(x/0);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Program stopped due to an error" + e.getMessage());
//        }
//        catch (ArithmeticException e1){
//            System.out.println("Program stopped due to an error" + e1.getMessage());
//        }


        System.out.println("Finished Execution!");

    }


}

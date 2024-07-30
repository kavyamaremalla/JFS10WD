import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ErrorHandling {

    public static void main(String[] args)   {

//        checkAge(17); //unchecked exception
        try {
            getScore("sdjgfeuwig"); // checked exception
        } catch (FileNotFoundException | RuntimeException e) {
            throw new RuntimeException(e);
        }

        try {
            checkAge(17);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }

    static void checkAge(int age) throws ArithmeticException{
        if(age < 18 ){
            throw new ArithmeticException("You are not eligible to vote!");
        }else{
            System.out.println("Eligible to vote");
        }
    }

    public static int getScore(String playerFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(playerFile));
        return Integer.parseInt(scanner.nextLine());
    }
}

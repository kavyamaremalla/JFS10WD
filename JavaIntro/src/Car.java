import java.util.Scanner;

public class Car {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age ");

        int age = scanner.nextInt();


        System.out.println(age > 18 && age < 100);//false
        System.out.println(age > 18 || age < 100);//true
        System.out.println(!(age > 18 || age < 100));//false

    }

}

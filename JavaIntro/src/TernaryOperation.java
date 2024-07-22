import java.util.Scanner;

public class TernaryOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creating an object for scanner

        System.out.println("Please enter value for age : ");
        int age = scanner.nextInt();

       String result = age >= 18 ? "Eligible to vote"  :
              "Please check next time, not-eligible" ;

        System.out.println(result);

//        if(age >= 18){
//            System.out.println("Eligible to vote");
//        }else{
//            System.out.println("Please check next time, not-eligible");
//        }


    }
}

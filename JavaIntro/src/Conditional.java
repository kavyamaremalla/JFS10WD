import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //creating an object for scanner

        System.out.println("Please enter value for x : ");
        int x = scanner.nextInt();

        System.out.println("Please enter value for y : ");
        int y = scanner.nextInt();

//        if( x == y){
//            System.out.println(" x Equals y");
//            if(y == 6){ //nested-if
//                System.out.println("y value is 6");
//            }
//        }else {
//            if(x == 6 || y == 6){
//                System.out.println("Either x or y value is 6");
//            }
//        }

        if(x == 6){
            System.out.println(1);
            for (int i = 0; i < x; i++) {
                System.out.println(i);
                break;
            }
        }
        if(x == 7){
            System.out.println(2);

        }
    }
}

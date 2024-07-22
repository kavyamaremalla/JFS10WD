import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day in a week ");
//        char dayOfWeek = scanner.next().charAt(0);

        String dayOfWeek = scanner.next();

        switch (dayOfWeek){
            case "Monday" :
                System.out.println("Day 1");
                return;
            case "Tuesday" :
                add();
                System.out.println("Day 2");
                break;
            case "Wednesday" :
                System.out.println("Day 3");
                break; //keyword
            default:
                System.out.println("Please check your input");
        }

        System.out.println("Finished execution");

    }

    public static void add(){
        System.out.println("Inside add");
    }
}

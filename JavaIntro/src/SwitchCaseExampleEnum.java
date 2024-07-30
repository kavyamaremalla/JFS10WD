public class SwitchCaseExampleEnum {

    public static void main(String[] args) {

        Priority dayOfWeek = Priority.Monday;

        System.out.println(String.valueOf(dayOfWeek));

        switch (dayOfWeek){
            case Monday :
                System.out.println("Day 1");
                return;
            case Tuesday :
                add();
                System.out.println("Day 2");
                break;
            case Wednesday :
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

import java.time.DayOfWeek;

public class SwitchCaseUpdates {

    public static void main(String[] args) {

        Priority dayOfWeek = Priority.Monday;

        int x = switch (dayOfWeek){
            case Monday :
            {
                System.out.println("It is Monday ");
                yield 1;
            }
            case Tuesday: yield 2;
            case Wednesday:
                yield 3;
            case Thursday:
                yield 4;
            case Friday:
                yield 5;
            case Saturday:
                yield 6;
            case Sunday:
                yield 7;
            default:yield 0;
        };

        System.out.println(x);
    }
}

//after Java17

class SwitchUpdate17{
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;

        int y = switch (dayOfWeek){
            case MONDAY ->
            {
                System.out.println("It is a Monday");
                yield 1;
            }
            case TUESDAY-> 2;
            case WEDNESDAY -> 3;
            case THURSDAY-> 4;
            case FRIDAY-> 5;
            case SATURDAY-> 6;
            case SUNDAY-> 7;
            default-> 0;
        };

        System.out.println(y);
    }
}

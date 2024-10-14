public class Add {

    public static int add(int a, int b)   {
        sub(3, 4); //Mocking : dummy
        return a + b;
    }

    private static void sub(int a, int b){
        System.out.println("In sub " + a + " " + b);
    }

    public String fullName(String firstName, String lastName){
        if(firstName == null){
            firstName = "";
        }
        if(lastName == null){
            lastName = "";
        }
        return firstName + lastName;
    }
//
//    public static void main(String[] args) {
////        System.out.println(fullName("John", "Doe"));
////        System.out.println(add(1,3));
////        System.out.println(add(-1,-9));
////        System.out.println(add(-1,9));
//    }
}

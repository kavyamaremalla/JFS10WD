public class AccessModifiers {

    public String firstName; // accessible from anywhere

    protected int age; // accessible within a package, subclasses, class

     boolean isMarried; //default access -> within same package

    private double salary; // only within a class

    public void printPersonDetails(){
        salary = 10000.00d;
        System.out.println(firstName + " " + age + " " + isMarried + " " + salary);
    }


}

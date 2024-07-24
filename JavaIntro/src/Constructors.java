public class Constructors {

    int x ;

    String name;
    Boolean isIndian;
    Double salary;

    public Constructors(int y){
        x = y; //setting a value for class variable
    }

    //creating a constructor for Constructors class
    public Constructors(int x, String personName, Boolean isIndian, Double salary){
        this.x = x; //setting a value for class variable
        name = personName;
        this.isIndian = isIndian;
        this.salary = salary;
    }

    public Constructors() {
            //default constructor
    }

    public static void main(String[] args) {

        Constructors defaultConstructor = new Constructors();
        Constructors constructors = new Constructors(6); //create an object of class
        Constructors constructors1 = new Constructors(6, "John", false,10987.67d);
        System.out.println(constructors.x);
        System.out.println(constructors1.x + " " +constructors1.name + " " + constructors1.isIndian + " " + constructors1.salary);

    }


}

public class Constructors {
//what this class does
    int x ;
    //Encapsulation
    private String name;
    Boolean isIndian;
    Double salary;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Boolean getIndian() {
        return isIndian;
    }

    public void setIndian(Boolean indian) {
        isIndian = indian;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Constructors(int y){
        x = y; //setting a value for class variable
    }


    //Setter
    public void setName(String newName){
        this.name = newName;
    }

    //Getter
    public String getName(){
        return name;
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

    /**
     *
     */
    private int createConstructorPersondetails(String name){
        Constructors constructors1 = new Constructors(6, "John", false,10987.67d);
        return 0;

    }
   //single line comment

  /*  n methods can call the
            createConstructorPersondetails*/


}

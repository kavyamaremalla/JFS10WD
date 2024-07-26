
class Person{ //Parent class

    private String name;

    private int age;

    public Person(String name, int age){ //Constructor for parent class
        this.name = name;
        this.age =age;
    }


    public void display(){
           System.out.println("Person Name : " + name + " Person age : " + age);
    }
}

class Employee extends PersonTask { //subclass or child class

    private String empId;

    private double salary;

    public Employee(String name, int age, String empId, double salary) { //Constructor for parent class
        super(name, age); //Calls parent class's constructor
        this.empId = empId;
        this.salary = salary;
    }

    public void display(){
        super.display();
        System.out.println("Employee Id : " + empId + " Employee salary : " + salary);
    }

}

public class SuperDemo { //to test your Emp class
    public static void main(String[] args) {
        EmployeeTask employeeTask = new EmployeeTask("Peter Parker", 25, "E1234", 100000.89d);
        employeeTask.display();
    }
}

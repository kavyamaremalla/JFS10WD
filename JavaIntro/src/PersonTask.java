public class PersonTask {
    String name;
    int age;
    public PersonTask(){
    }
        public PersonTask(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("person name:"+name);
        System.out.println("person age:"+age);
    }
}

class EmployeeTask extends PersonTask{
    //Create a subclass Employee that inherits from Person and adds attributes like employeeID and
    //salary.
    String employeeID;
    double salary;
    public EmployeeTask(String name,int age,String employeeID,double salary){
        //Use the super keyword to initialize the Person attributes in the Employee constructor.
        super(name, age);
        this.employeeID=employeeID;
        this.salary=salary;
    }
    public void display(){
        System.out.println("person name:"+name);
        System.out.println("person age:"+age);
        System.out.println("employee ID:"+employeeID);
        System.out.println("employee salary:"+salary);
    }

    public static void main(String[] args) {
        PersonTask p=new PersonTask("jsp",20);
        p.display();

        EmployeeTask e=new EmployeeTask("Jaya Surya Prakash R",21,"JSP@123",50000);

        e.display();

        p.display();

        PersonTask p1 = new EmployeeTask("Jaya Surya Prakash R",21,"JSP@123",50000);
        p1.display();

    }

}
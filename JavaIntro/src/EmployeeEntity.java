import java.util.Objects;

public class EmployeeEntity {

    private int empId;

    private String name;

    private double salary;

    // default constructor
    public EmployeeEntity() { }

    // parameterized constructor
    public EmployeeEntity(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "EmployeeEntity { " +
                "empId = "  + empId +
                ", name = ' " + name +
                ", salary = ' " + salary + '}';

    }

    @Override
    public boolean equals(Object empObject) {
        if (this == empObject) return true;
        if (empObject == null || getClass() != empObject.getClass()) return false;
        EmployeeEntity employee = (EmployeeEntity) empObject;
        return empId == employee.empId && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(empId, name, salary);
    }
}

public class EmpOperations{
    public static void main(String[] args) {
        EmployeeEntity employee = new EmployeeEntity();

        employee.setEmpId(1);
        employee.setName("Jill");
        employee.setSalary(100);

        EmployeeEntity employee1 = new EmployeeEntity(1, "Jill", 100);

        EmployeeEntity employee2 = employee1;

//        System.out.println(employee);
//        System.out.println(employee1);


//        int hashCode = employee.hashCode();
//        String hexaHashCode = Integer.toHexString(hashCode);
//        System.out.println(hashCode);
//        System.out.println(hexaHashCode);

        System.out.println(employee.equals(employee1));//true if you overrride equals else false, because here you are comparing the values in object

        System.out.println(employee.hashCode());

        System.out.println(employee2.hashCode());
        System.out.println(employee1.hashCode());

        System.out.println(employee2.equals(employee1));
    }
}

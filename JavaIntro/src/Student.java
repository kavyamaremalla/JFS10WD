import java.util.ArrayList;
import java.util.List;

public record Student(int rollNumber, String name) {
//    private static int age;
}

class TestStudentRecord{
    public static void main(String[] args) {
        Student student = new Student(3, "Peter");

        System.out.println(student.name());
        System.out.println(student.rollNumber());
        System.out.println(student);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(2 , "John"));

//        for (Student stu : studentList){
//            System.out.println(stu);
//        }

//        Student student1 = new Student(3, "Peter");
//
//        System.out.println(student1.equals(student));

        studentList.forEach(System.out::println);
    }
}
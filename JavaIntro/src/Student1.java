import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student1 implements Comparable<Student1>{

    String name;

    int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int compareTo(Student1 s) {
//        return this.age - s.age; // ascending order
        return s.age - this.age; // descending order
    }


    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class NameComparator implements Comparator<Student1> {

    public int compare(Student1 s1, Student1 s2) {
//        return s1.name.compareTo(s2.name); //ascending order
        return s2.name.compareTo(s1.name); // descending order
    }
}

class TestComp{
    public static void main(String[] args) {
        List<Student1> studentList = new ArrayList<>();

        studentList.add(new Student1("Peter", 12));
        studentList.add(new Student1("John", 13));
        studentList.add(new Student1("Alice", 11));

        Collections.sort(studentList);
        System.out.println("Sorted by age : " + studentList);

        Collections.sort(studentList, new NameComparator().reversed());
        System.out.println("Sorted by name : " + studentList);

        Collections.sort(studentList, new NameComparator());
        System.out.println("Sorted by name : " + studentList);

    }
}

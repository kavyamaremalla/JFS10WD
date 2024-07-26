public final class ImmutablePerson {

    private final String name = "Peter";

    private final int age;

    //constructor to initialize the fields
    public ImmutablePerson(String name, int age) {
//        this.name = name;
        this.age = age;
    }

    //getters to access our fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ImmutablePerson immutablePerson = new ImmutablePerson("John Doe", 30);
        //try to modify, it gives compilation error
//        immutablePerson.age = 40;
        System.out.println(immutablePerson.name + " " + immutablePerson.age);
    }
}

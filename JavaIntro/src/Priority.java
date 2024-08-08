public enum Priority {

//    LOW,
//    Medium,
//    high,
//    Critical,
    Sunday,
    Monday,
    Tuesday,
    Wednesday,

    Thursday,

    Friday,

    Saturday
    //All constants are by default public, static, final
}

class TestPriority{


    public static void main(String[] args) {
//        Priority priority = Priority.LOW;
//        System.out.println(priority);

        for (Priority  priority1 : Priority.values()){
            System.out.println(priority1);
        }
    }
}


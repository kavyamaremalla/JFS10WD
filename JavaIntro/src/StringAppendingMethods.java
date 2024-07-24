public class StringAppendingMethods {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("hello");//more-efficient, Java 1.5
        builder.append("java");
        System.out.println(builder); //non-synchronized, running parallely, non-thread safe

        StringBuffer buffer = new StringBuffer("hello");//less efficient, Java 1.0
        buffer.append("java");
        System.out.println(buffer); //synchronized -> thread safe


    }
}

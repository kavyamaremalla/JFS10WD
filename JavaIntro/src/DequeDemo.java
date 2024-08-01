import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("first");
        deque.add("second");
        deque.add("third");
        deque.add("fourth");
        deque.add("fourth");
//        deque.add(null);

        deque.addFirst("zero");
        deque.removeLast();
        deque.addLast("fifth");
        System.out.println(deque.pollFirst());
        System.out.println( deque.pollLast());

        for (String element : deque){
            System.out.println(element);
        }
    }
}

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();

//        queue.add("third");
        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.add("fourth");
//        queue.add(null);
//        queue.add(null);

        System.out.println(queue.peek()); // give the head of queue

        System.out.println(queue.poll());

        for (String object : queue){
            System.out.println(object);
        }

         System.out.println(queue.element());// give the head of queue


    }
}

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

//        System.out.println(stack.empty());

        stack.add(17);
        stack.add(15);
        stack.add(15);
        stack.push(null);
        stack.add(null);
        stack.add(0, 20);
        stack.add(22);
        stack.push(29);

//        System.out.println(stack.peek());
//
//        System.out.println(stack.pop());

//       stack.remove(4);
//
//       stack.removeElementAt(5);

        for (Integer number : stack){
            System.out.println(number);
        }
    }

}

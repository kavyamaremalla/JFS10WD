import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {




    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();// creation of array list

        //update arrayList : add elements

        fruits.add("mango"); // index 0
        fruits.add("banana");// index 1
        fruits.add("mango"); // index 2
        fruits.add("apple"); //index 3
        fruits.add(null);
        fruits.add(null);



        fruits.add(2, "Orange");// to add in a particular position

        fruits.set(1, "grapes");//replaces value in the specified index position
//        fruits.set(2, "kiwi");

//        System.out.println(fruits.get(2));

//        fruits.remove(2); // delete an element from particular index

        System.out.println(fruits.size()); //size of array list

//        fruits.clear();

//        fruits.removeAll(fruits);
//        Collections.sort(fruits);
//
//        System.out.println(fruits.contains("mango"));
//        System.out.println(fruits.contains("pineapple"));

        if (fruits.size() <= 0){
            System.out.println("Deleted all fruits");
        }


        for (String fruit : fruits){ //read elements in an arrayList
            System.out.println(fruit);

        }

//        int[] numbers = new int[5];//array

        int[] numbers = {1,2,3,4,5};
        //convert array into array list
        ArrayList<Integer> numberList = new ArrayList<>();
//        List<Integer> numbList = new ArrayList<>();
        for (Integer number : numbers){
            numberList.add(number);
        }

        numberList.toArray(); //list converts into array
    }

}

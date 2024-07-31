import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
//        Set<Integer> integerSet = new HashSet<>();

        HashSet<Integer> integerHashSet = new HashSet<>();

        integerHashSet.add(4);
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(1);
        integerHashSet.add(null);
        integerHashSet.add(null);
        integerHashSet.add(0);

//        integerHashSet.add(1, 9);

        Iterator<Integer> iterator = integerHashSet.iterator();
//        while (iterator.hasNext()){
////            System.out.println(iterator.next());
//        }

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(11);

        HashSet<Integer> numberSetList = new HashSet<>(numberList);


        //LinkedHashSet

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("four");
        set.add(null);
        set.add("one");
        set.add("two");
        set.add("one");
        set.add(null);


//        for (String element : set){
//            System.out.println(element);
//        }

        TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add(null);
        treeSet.add("rama");
        treeSet.add("vishal");
        treeSet.add("rama");
        treeSet.add("apple");
//        treeSet.add(null);

//        System.out.println(treeSet.pollFirst());//removes first element
//        System.out.println(treeSet.pollLast());//removes last element

        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.headSet("vishal", true));
        System.out.println(treeSet.headSet("vishal", false));

        System.out.println(treeSet.tailSet("apple", true));
        System.out.println(treeSet.tailSet("apple", false));

        System.out.println(treeSet.subSet("apple", false, "vishal", false));


        for (String element : treeSet){
            System.out.println(element);
        }



    }
}

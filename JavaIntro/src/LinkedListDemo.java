import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("john");
        names.add("jill");
        names.add("ana");
        names.add("peter");
        names.set(1, "harry");
        names.add(1, "parker");
        names.add("john");
        names.add("john");


//        for (String name : names){
//            System.out.println(name);
//        }



        LinkedList<String> namesA = new LinkedList<>();
        namesA.add("rose");
        namesA.add("doe");

        names.addAll(namesA);

        names.removeAll(namesA);

//        names.clear();

        names.addLast("abed");
        names.addFirst("xyz");

        names.removeFirst();
        names.removeLast();

//        names.removeFirstOccurrence("john");
//
//        names.removeLastOccurrence("john");

        Iterator<String> iterator =  names.iterator(); // insertion order
//        names.descendingIterator(); // reverse the insertion order

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        LinkedList<Bike> bikes = new LinkedList<>();
        bikes.add(new Bike());//creating obj directly inside add
        bikes.add(new Bike());

        Bike bike = new Bike();
//        bike.brand = "list";
        bikes.add(bike);//creating object separately & passing the object inside bike

        for(Bike bikeObj : bikes){
            System.out.println(bikeObj);
        }
    }
}

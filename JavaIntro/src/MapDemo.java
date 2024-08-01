import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1 , "John");
        hashMap.put(2, "Jill");
        hashMap.put(0, "Jack");
        hashMap.put(1,"Peter");
        hashMap.put(null, null);
        hashMap.put(null, null);

        LinkedHashMap<Integer, String>  linkedHashMap= new LinkedHashMap<>();

        TreeMap<Integer, String> treeMap = new TreeMap<>();

//        hashMap.remove(1);
        Set<Map.Entry<Integer, String>> set = hashMap.entrySet();
        Set<String> stringSet = new HashSet<>();

//        System.out.println(hashMap.get(1));
//        for (String name : hashMap.values()){
//            System.out.println(name);
//        }

//        Iterator iterator = set.iterator();
//
//        while (iterator.hasNext()){
//            Map.Entry entry = (Map.Entry) iterator.next();
//
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


//        System.out.println(hashMap.values()); //list of values
//        System.out.println(hashMap.keySet()); // set of keys

        for(Integer key : hashMap.keySet()){
            System.out.println(key + " " + hashMap.get(key));
        }

//        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }



    }
}

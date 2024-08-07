import java.util.HashMap;

public class VarKeyWordDemo {

    int global = 18;

    public static void main(String[] args) {

        String name = null;

        var div = 5d/2;

        System.out.println(div);

      var map = new HashMap<String, Integer>();
      map.put("student", 1);

    for (var entry : map.entrySet()){
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
    }

    }

//    public var add(int a, var b){
//        return  a * a;
//    }
}

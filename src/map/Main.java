package map;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> map2 =new HashMap<>();
        map2.put("Golubec","Borisov");
        map2.put("Smitt","London");
        map2.put("Antony","Moskow");

        System.out.println(map2.get("Antony"));

        HashMap<Integer,String> map3 =new HashMap<>();

        map3.put(12, "Paul");
        map3.put(41,"Olga");
        map3.put(124,"Toni");
        map3.put(11,"Archi");

        System.out.println(map3);

        System.out.println(map3.keySet());




    }

}

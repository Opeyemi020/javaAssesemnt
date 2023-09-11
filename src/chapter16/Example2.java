package chapter16;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> dictionary = new HashMap<>();
        map.put("Asiwaju",200);
        map.put("Yungidu",200);
        map.put("Chimo",200);
        map.put("Bestie",200);


        dictionary.putAll(map);

        map.forEach((k,v)-> System.out.println(k+"::"+v));

    }


}

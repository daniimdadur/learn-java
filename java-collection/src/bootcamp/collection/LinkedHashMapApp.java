package bootcamp.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>(); //urutannya sama.
                                                         //tapi get datanya lambat, terutama jika diposisi paling akhir.
        map.put("First", "Dani");
        map.put("Last", "Rohman");
        map.put("Middle", "Imdadur");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}

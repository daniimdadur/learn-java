package bootcamp.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("first", "Dani");
        map.put("middle", "Imdadur");
        map.put("last", "Rohman");

        Set<Map.Entry<String,String>> entries = map.entrySet(); //mengakses key dan valuenya

        for (var value : entries) {
            System.out.println(value.getKey() + " : " + value.getValue()); //mengakses key dan valuenya
        }
    }
}

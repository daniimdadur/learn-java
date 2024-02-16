package bootcamp.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("First name","Dani");
        map.put("Middle name","Imdadur");
        map.put("Last name","Rohman");

        System.out.println(map.get("First name"));
        System.out.println(map.get("Middle name"));
        System.out.println(map.get("Last name"));
    }
}

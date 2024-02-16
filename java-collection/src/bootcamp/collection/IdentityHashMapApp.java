package bootcamp.collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2)); //hasilnya true karena lihat dari isi valuenya.
        System.out.println(key1 == key2); //hasilnya false, karena lokasi di memorynya berbeda.

        map.put(key1, "Dani");
        map.put(key2, "Dani");

        System.out.println(map.size());
    }
}

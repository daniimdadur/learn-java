package bootcamp.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>(); //otomatis terurut sesuai abjad.

        map.put("Eko","Eko");
        map.put("Budy","Budy");
        map.put("Joko","Joko");

        for (var key : map.keySet()){
            System.out.println(key);
        }
        System.out.println(map.lowerKey("Eko")); //kurang dari
        System.out.println(map.higherKey("Eko")); //lebih dari
        System.out.println(map.floorKey("Nugraha")); //kurang dari sama dengan
        System.out.println(map.ceilingKey("Amel")); //lebih dari sama dengan

        NavigableMap<String, String> mapDesc = map.descendingMap(); //membalikan
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }
        //membuat data immutable
        NavigableMap<String, String> empty = Collections.emptyNavigableMap(); //kosong
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        //immutable.put("Sabilla","Sabilla"); //ERROR
    }
}

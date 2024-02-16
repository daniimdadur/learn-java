package bootcamp.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        //membuat comparator
        Comparator<String> stringComparator = new Comparator<String>() { //anonymous class
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); //kebalikan/desending
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("Eko","Eko");
        sortedMap.put("Budy","Budy");
        sortedMap.put("Joko","Joko");

        for (String value : sortedMap.keySet()) { //otomatis diurutkan
            System.out.println(value);
        }

        //mengubah ke immutable
        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

        //immutable.put("Sabil", "Sabil"); //ERROR
    }
}

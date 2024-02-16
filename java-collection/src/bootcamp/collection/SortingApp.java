package bootcamp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(List.of("Dani","Imdadur","Rohman","Bootcamp","Java","Pamaricab"));

        Collections.sort(list); //mengurutkan sesuai abjad.

        for (var value : list) {
            System.out.println(value);
        }
        System.out.println();

        Comparator<String> comparator = new Comparator<String>() { //menggunakan comparator
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); //membalikan
            }
        };

        Collections.sort(list,comparator);

        for (var value : list) {
            System.out.println(value);
        }
    }
}

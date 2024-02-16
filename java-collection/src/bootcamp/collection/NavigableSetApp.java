package bootcamp.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();

        names.addAll(Set.of("Dani","Imdadur","Rohman","Bootcamp","Java","Pamarican")); //tidak berurutan.

        NavigableSet<String> namesReverse = names.descendingSet(); //dibalik.
        NavigableSet<String> imdadur = names.headSet("Imdadur", true); //mengambil sebagian dari depan
        NavigableSet<String> java = names.tailSet("Java",true); //mengambil sebagian dari belakang

        System.out.println("Semua tapi tidak berurutan");
        for (String value : names) {
            System.out.println(value);
        }
        System.out.println();
        System.out.println("Kebalikan");
        for (String value : namesReverse) {
            System.out.println(value);
        }
        System.out.println();
        System.out.println("Mengambil sebagian dari depan");
        for (String value : imdadur) {
            System.out.println(value);
        }
        System.out.println();
        System.out.println("Mengambil sebagian dari belakang");
        for (String value : java) {
            System.out.println(value);
        }
        NavigableSet<String> imutable = Collections.unmodifiableNavigableSet(names); //konversi menjadi imutable.
        //imutable.add("Djancook"); ERROR, karena sudah dikonversi menjadi immutable.
    }
}

package bootcamp.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    /*
    ~Datanya cuma bisa diterima satu, walaupun ada yg duplikat.
    ~Perbedaan List dan Set:
        -Jika List digunakan ketika tidak peduli dengan duplikat ataupun nggk.
        -Jika Set digunakan ketika mastiin datanya tidak ada yg duplikat.
     */
    public static void main(String[] args) {

        Set<String> names2 = new HashSet<>(); //Tidak berurutan
        Set<String> names = new LinkedHashSet<>(); //Berurutan

        names.add("Dani");
        names.add("Imdadur");
        names.add("Rohman");
        names.add("Dani");
        names.add("Imdadur");
        names.add("Rohman");

        for (String value : names) {
            System.out.println(value);
        }
        System.out.println();
        names2.add("Dani");
        names2.add("Imdadur");
        names2.add("Rohman");
        names2.add("Dani");
        names2.add("Imdadur");
        names2.add("Rohman");

        for (String value2 : names2) {
            System.out.println(value2);
        }
    }
}

package bootcamp.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSet {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet(); //imutable Set kosong
        Set<String> one = Collections.singleton("Dani"); //imutable Set berisi 1 element

        Set<String> mutable = new HashSet<>();
        mutable.add("Dani");
        mutable.add("Imdadur");
        mutable.add("Rohman");
        Set<String> imutable = Collections.unmodifiableSet(mutable); //mengubah mutable menjadi imutable

        Set<String> set = Set.of("Dani", "Imdadur", "Rohman"); //membuat imutable Set dari element-element
        //set.add("Budy"); //ERROR
        //set.remove("Dani"); //ERROR
    }
}

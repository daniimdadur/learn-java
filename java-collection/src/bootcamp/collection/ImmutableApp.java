package bootcamp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Dani"); //immutable list berisi 1 element
        List<String> empty = Collections.emptyList(); //Immutable list kosong

        List<String> mutable = new ArrayList<>();
        mutable.add("Imdadur");
        mutable.add("Rohman");
        List<String> immutable = Collections.unmodifiableList(mutable); //mengubah mutable list menjadi immutable

        List<String> elements = List.of("Dani","Imdadur","Rohman"); //membuat immutable list dari element-element.
    }
}

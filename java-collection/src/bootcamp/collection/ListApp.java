package bootcamp.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    /*
    ~Jika hanya menambah dan juga menghapus, disarankan menggunakan ArrayList,
    ~Jika hanya mengubah dan juga mengakses, disarankan menggunakan LinkedList,
     */
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
//        List<String> strings1 = new LinkedList<>();

        strings.add("Dani");
        strings.add("Imdadur");
        strings.add("Rohman");

        strings.set(0,"Dhani");

        strings.remove(2);

        System.out.println(strings.get(1));

        for (String value : strings){
            System.out.println(value);
        }
    }
}

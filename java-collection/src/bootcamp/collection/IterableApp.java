package bootcamp.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    /*
    ~Iterable @ parent untuk semua collection di java, kecuali map
    ~Iterable sendiri sangat sederhana, hanya digunakan agar mendukung for-each loop
     */
    public static void main(String[] args) {

        //manggunakan iterable
        Iterable<String> names = List.of("Dani","Imdadur","Rohman");
        for (String name : names) {
            System.out.println(name);
        }
        //jika manual menggunakan iterator
        System.out.println("ITERATOR");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}

package bootcamp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Dani");
        collection.add("Imdadur");
        collection.add("Rohman");
        collection.addAll(List.of("Programmer","Zaman","Now")); //fungsinya sama seperti Arrays.aslist
        collection.addAll(Arrays.asList("Sukahurip","Pamarican","Ciamis")); //fungsinya sama seperti List.of

        for (String value:collection) {
            System.out.println(value);
        }
        //menghapus
        System.out.println();
        System.out.println("REMOVE");
        collection.remove("Rohman");
        collection.removeAll(List.of("Sukahurip","Ciamis")); //menghapus lebih dari satu data

        for (String value : collection){
            System.out.println(value);
        }
        //mengecek data
        System.out.println();
        System.out.println("MENGECEK");
        System.out.println(collection.contains("Dani")); //true
        System.out.println(collection.contains("Sukahurip")); //false
        System.out.println(collection.containsAll(Arrays.asList("Imdadur","Dani"))); //mengecek lebih dari satu data
        System.out.println(collection.size()); //mengecek jumlah data
    }
}

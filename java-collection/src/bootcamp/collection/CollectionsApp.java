package bootcamp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.addAll(List.of("Dani","Imdadur","Rohman","Bootcamp","Java","Pamarican"));
        list1.addAll(List.of("Sabilla","Muhammad","Rayhan","Bootcamp","Java","Pamarican"));

        System.out.println(list);

        Collections.copy(list1,list); //copy semua data list from ke list to
        System.out.println(list1);

        Collections.reverse(list); //membalikan
        System.out.println(list);

        Collections.shuffle(list); //mengacak
        System.out.println(list);

    }
}

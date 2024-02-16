package bootcamp.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {

        List<String> list = List.of("Dani","Imdadur","Rohman");

        Object[] objects = list.toArray(); //konversi ke array
        String[] strings = list.toArray(new String[]{}); //konversi ke array

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));

    }
}

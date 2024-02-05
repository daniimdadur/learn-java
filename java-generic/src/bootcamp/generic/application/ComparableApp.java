package bootcamp.generic.application;

import java.util.Arrays;

public class ComparableApp {
    //Operator perbandingan compareble bisa kita lakukan, jika object kita mewariskan interface generic Comparable.
    public static void main(String[] args) {

        Person[] people = {
                new Person("Sabil","Surabaya"),
                new Person("Vida","Bekasi"),
                new Person("Dani","Ciamis")
        };
        Arrays.sort(people); //mengurutkan array dari alfabet.
        System.out.println(Arrays.toString(people));
    }
}

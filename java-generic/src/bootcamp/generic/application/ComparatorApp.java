package bootcamp.generic.application;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    //Jika kita ingin mengurutkan class milik orang lain, maka kita bisa menggunakan interface generic yg bernama Comparator.
    public static void main(String[] args) {

        Person[] people = {
                new Person("Sabil","Surabaya"),
                new Person("Vida","Bekasi"),
                new Person("Dani","Ciamis")
        };
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(people,comparator);
        System.out.println(Arrays.toString(people));
    }
}

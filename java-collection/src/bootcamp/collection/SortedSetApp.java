package bootcamp.collection;

import bootcamp.collection.data.Person;
import bootcamp.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator()); //jika pgn dibalikan pengurutannya maka gunakan perintah '.reversed'.

        people.add(new Person("Dani"));
        people.add(new Person("Imdadur"));
        people.add(new Person("Rohman"));

        for (var person : people) {
            System.out.println(person.getName());
        }
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people); //imutable
        //sortedSet.add(new Person("Dani")); ERROR, karena sudah bersifat imutable.
    }
}

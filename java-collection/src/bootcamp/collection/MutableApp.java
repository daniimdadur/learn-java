package bootcamp.collection;

import bootcamp.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Dani");

        person.addHobby("Coding");
        person.addHobby("Game");

        doSomethingWithHobbies(person.getHobbies());

        for (String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }
    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan Hobby"); //ERROR, karena mencoba menambah data di field hobbies, sedangkan di getter hobbinya sudah diubah menjadi immutable.
    }
}

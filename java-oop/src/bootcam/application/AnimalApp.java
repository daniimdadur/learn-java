package bootcam.application;

import bootcam.annotation.Fancy;
import bootcam.data.Animal;
import bootcam.data.Cat;

@Fancy(name = "AnimalApp", tags = {"Application", "Java"})
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "puss";
        animal.run();

        Cat cat = new Cat();
        cat.name = "Sabil";
        cat.run("Pamarican");
    }
}

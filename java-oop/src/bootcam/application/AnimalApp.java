package bootcam.application;

import bootcam.data.Animal;
import bootcam.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "puss";
        animal.run();
    }
}

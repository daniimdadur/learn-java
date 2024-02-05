package app;

import java.util.Random;

public class RandomApp {
    //Random class @ class yg bisa kita gunakan untuk men-generate random number
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int value = random.nextInt(1000);
            System.out.println(value);
        }
    }
}

package bootcamp.generic.application;

import bootcamp.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Dani", "Imdadur", "Rohman"};
        Integer[] numbers = {1,2,3,4,5,6,7};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(numbers));
    }
}

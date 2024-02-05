package app;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {
                9,423,7357,894567,79,22,12,13,14,52
        };

        Arrays.sort(numbers); //mengurutkan array
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers,13)); //mencari index array
        System.out.println(Arrays.binarySearch(numbers,22));
        System.out.println(Arrays.binarySearch(numbers,100)); //error, karena melebihi index.

        int[] result = Arrays.copyOf(numbers,5); //mengcopy array
        System.out.println(Arrays.toString(result));
        int[] result2 = Arrays.copyOfRange(numbers,2,7);
        System.out.println(Arrays.toString(result2));
    }
}

package bootcamp.generic.application;

import bootcamp.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        //Multiple paremeter type.
        //Paremeter type di generic class boleh lebih dari satu.
        Pair<String, Integer> pair = new Pair<>("Dani",13);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}

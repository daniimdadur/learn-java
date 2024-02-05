package app;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    //String tokenizer class @ class yg bisa digunakan untuk memotong string menjadi token atau string yg lebih kecil.
    //kita bisa memotong string dengan deliver yg kita mau.
    public static void main(String[] args) {

        String value = "Dani Imdadur Rohman";
        StringTokenizer tokenizer = new StringTokenizer(value," " );

        while (tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}

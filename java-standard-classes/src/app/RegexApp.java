package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    //Regex @ cara untuk melakukan pola pencarian.
    //Misal kita ingin mencari semua kata yg mengandung diawali huruf a dan diakhiri huruf a, dll.
    public static void main(String[] args) {

        String name = "Dani Imdadur Rohman Programmer Zaman Now";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        //Pattern @ representasi hasil kompilasi dari pola reguler expression yg kita buat.
        Matcher matcher = pattern.matcher(name);
        //Matcher @ engine untuk melakukan pencarian dari pattern yg sudah kita buat.

        while (matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }
    }
}

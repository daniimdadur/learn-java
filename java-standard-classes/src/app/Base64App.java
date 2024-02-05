package app;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {

        String original = "Dani Imdadur Rohman";

        String encode = Base64.getEncoder().encodeToString(original.getBytes()); //membuat encod.
        System.out.println(encode);

        byte[] bytes = Base64.getDecoder().decode(encode); //mengembalikan ke data asli.
        String result = new String(bytes);
        System.out.println(result);
    }
}

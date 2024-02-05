package app;

public class StringApp {
    public static void main(String[] args) {

        String name = "Dani Imdadur Rohman";
        String nameLowercase = name.toLowerCase(); //huruf kecil semua
        String nameUppercase = name.toUpperCase(); //huruf besar semua

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length()); //mendapatkan panjang string
        System.out.println(name.startsWith("Dani")); //mengecek apakah dimulai dengan string value
        System.out.println(name.endsWith("Rohman")); //mengecek apakah diakhiri dengan string value

        String[] names = name.split(" "); //memotong string dengan string value
        for (String value : names){
            System.out.println(value);
        }
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0)); //mengambil value

        char[] chars = name.toCharArray(); //mengambil semua value
            System.out.println(chars);
    }
}

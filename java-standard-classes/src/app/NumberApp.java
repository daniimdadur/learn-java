package app;

public class NumberApp {
    //semua number class yg bukan primitif mempunyai parent class yg sama, yaitu class number.
    //class number memiliki banyak method yg bisa digunakan untuk mengkonversi ke tipe number lainnya.
    //Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya.
    public static void main(String[] args) {

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();
        Integer integerValue = shortValue.intValue();

        //konversi string ke number.
        //Long,Integer,Short,dan Byte memiliki static method untuk melakukan konversi dari string ke number.
        String contoh = "10000";

        Integer contohInt = Integer.valueOf(contoh); //object (bukan primitif) menggunakan valueOf
        System.out.println(contohInt);

        int contohInteger = Integer.parseInt(contoh); //primitif menggunakan parseInt
        System.out.println(contohInteger);


    }
}

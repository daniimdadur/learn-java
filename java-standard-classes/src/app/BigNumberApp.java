package app;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        //digunakan untuk angka besar yg melebihi kapasitas long dan double.
        //BigInteger @ class untuk handle tipe data Integer.
        //BigDecimal @ class untuk handle tipe data floating number.

        BigInteger a = new BigInteger("100000000000000000000");
        BigInteger b = new BigInteger("100000000000000000000");

        BigInteger tambah = a.add(b); //menambah
        BigInteger kurang = a.subtract(b); //mengurangi
        BigInteger kali = a.multiply(b); //mengkali
        BigInteger bagi = a.divide(b); //membagi
        BigInteger modulo = a.mod(b); //modulo

        System.out.println(tambah);
        System.out.println(kurang);
        System.out.println(kali);
        System.out.println(bagi);
        System.out.println(modulo);

    }
}

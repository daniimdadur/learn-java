package app;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        //class scanner @ class yg bisa digunakan untuk membaca input,entah dari file,console,dll
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.print("Umur : ");
        Integer age = scanner.nextInt();

        System.out.println("Hello " + name + " umur anda adalah " + age);
    }
}

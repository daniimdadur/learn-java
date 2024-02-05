package bootcamp.generic.application;

import bootcamp.generic.MyData;

public class TypeErasureApp {
    //Type erasure @ proses pengecekan generic pada saat compile time, dan menghiraukan pengecekan pada saat runtime.
    //Compiler akan mengubah generic paramter type menjadi tipe Object di java.
    //Oleh karena itu, konversi tipe data generic akan sangat berbahaya jika dilakukan secara tidak bijak.
    public static void main(String[] args) {

        MyData myData = new MyData<>("Dani");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}

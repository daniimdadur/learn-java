package bootcamp.generic.application;

import bootcamp.generic.MyData;

public class WildcardApp {
    //Kadang ada kasus kita tidak peduli dengan generic paremater type pada object.
    //Misal kita ingin mengeprint data T, tidak peduli tipe apapun.
    //Willcard bisa di buat dengan mengganti generic parameter type dengan karakter '?'.
    public static void main(String[] args) {

        print(new MyData<Integer>(1000));
        print(new MyData<String>("Vida Alisa Suci Nurhiza"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }
    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}

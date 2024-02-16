package bootcamp.generic.application;

import bootcamp.generic.MyData;

public class GenericClassApp {
    /*#Generic class @ class atau interface yg memiliki paremeter type.
    #Tidak ada ketentuan dalam pembuatan generic paremeter type, namun biasanya kebanyakan orang menggunakan 1 karakter-
    sebagai generic paremeternya type.
    #Nama generic parameter type yg biasa digunakan @:
    ~ E - Element (biasa digunakan di collection atau struktur data)
    ~ K - Key
    ~ N - Number
    ~ T - Type
    ~ V - Value*/

    public static void main(String[] args) {
        //membuat generic object
        MyData<String> stringMyData = new MyData<String>("Dani");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}

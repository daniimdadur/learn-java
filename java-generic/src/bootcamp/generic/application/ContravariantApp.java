package bootcamp.generic.application;

import bootcamp.generic.MyData;

public class ContravariantApp {
    //Contravariant @ kebalikan dari covariant.
    //Artinya kita bisa melakukan subtitusi supertype (parent) dgn subtype (child)
    //Caranya @ dgn menggunakan kata kunci (? super SubClass).
    //Artinya saat kita membuat object, contoh<Object>, maka bisa di subtitusi menjadi Contoh<? super String>.
    //Contravariant @ bisa write dan read, namun perlu berhati-hati ketika melakukan read, terutama jika sampai parent nya punya banyak child.
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Dani");
        objectMyData.setData(1000);

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());

    }
    public static void process(MyData<? super Object> myData){
        Object value = myData.getData();
        System.out.println("Hi my name is " + value);

        myData.setData("Vida");
    }
}

package bootcamp.generic.application;

import bootcamp.generic.MyData;

public class CovariantApp {
    //Covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent).
    //Caranya @ dgn menggunakan kata kunci (? extends ParentClass)
    //Artinya saat kita membuat object Contoh <String>, maka bisa disubtitusi menjadi Contoh <? extends Object>.
    //Covariant @ read-only, jadi kita tidak bisa mengubah data generic-nya
    //Di covariant set data berbahaya.
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Dani");
        process(stringMyData);

        MyData<? extends Object>myData = stringMyData;
    }
    public static void process(MyData<?extends Object> myData){
        System.out.println(myData.getData());

//        myData.setData(1); tidak boleh, karena berbahaya
    }

}

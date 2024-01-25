package MethodOverloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Eriksen");
        sayHello("Alejandro ","Garnacho");

    }

    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String nama){
        System.out.println("Hello " + nama);
    }
    static void sayHello(String firsName,String lastName){
        System.out.println("Hello " + firsName + lastName);
    }
}

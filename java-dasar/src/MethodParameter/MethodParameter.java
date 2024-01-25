package MethodParameter;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Jaka","Kurniadi");
        sayHello("Agung","Herkules");
        sayHello("Djancook","Kabeh");


    }

    static void sayHello(String firsName, String lastName ){

        System.out.println("Hello " + firsName + " " + lastName);
    }
}

package Scope;

public class Scope {
    public static void main(String[] args) {
        sayHello("Dani");
        sayHello("");

    }
    static void sayHello(String nama){
        String hello = "Hello " + nama;

        if(!nama.isBlank()){
            String hi = "Hi " + nama;
            System.out.println(hi);

        }
        System.out.println(hello);
    }
}

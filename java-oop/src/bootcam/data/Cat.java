package bootcam.data;

public class Cat extends Animal{

    public void run(String address){
        System.out.println("Cat " + name + " is run, and he live in " + address);
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " is run");
    }
}

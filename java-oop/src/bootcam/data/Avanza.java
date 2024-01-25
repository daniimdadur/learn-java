package bootcam.data;

public class Avanza implements Car{

    public void drive() {
        System.out.println("Avanza drive");
    }
    public int getTier() {
        return 5;
    }
    public String getBrand() {
        return "Toyota";
    }
    public boolean isMaintenance() {
        return true;
    }
}

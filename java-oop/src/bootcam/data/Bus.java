package bootcam.data;

public class Bus implements Car{
    public void drive() {
        System.out.println("Bus drive");
    }
    public int getTier() {
        return 10;
    }
    public String getBrand() {
        return "HINO";
    }
    public boolean isMaintenance() {
        return false;
    }
    public boolean isBig() {
        return true;
    }
}

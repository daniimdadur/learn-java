package bootcam.application;

import bootcam.data.Avanza;
import bootcam.data.Bus;
import bootcam.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());
        System.out.println();

        Car car1 = new Bus();
        car1.drive();
        System.out.println(car1.getTier());
        System.out.println(car1.getBrand());
        System.out.println(car1.isMaintenance());
        System.out.println(car1.isBig());
    }
}

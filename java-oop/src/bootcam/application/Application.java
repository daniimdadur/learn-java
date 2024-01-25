package bootcam.application;

import bootcam.data.*;

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Gula Aren",100_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}

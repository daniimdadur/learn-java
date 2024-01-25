package bootcam.application;

import bootcam.data.City;
import bootcam.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        //var location = new Location(); //ERROR karena menggunakan kata kunci abstrak

        var city = new City();
        city.name = "West Java";
        System.out.println(city.name);
    }
}

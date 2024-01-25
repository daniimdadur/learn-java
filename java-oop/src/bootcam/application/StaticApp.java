package bootcam.application;

import static bootcam.data.Application.processors;
import static bootcam.data.Constant.*;
import bootcam.data.Country;
import bootcam.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        //example from field
        System.out.println(application);
        System.out.println(version);

        //example from method
        System.out.println(MathUtil.sum(3,3,3,3,3));

        //example from inner class
        Country.City city = new Country.City();
        city.setName("Ciparakan City");

        System.out.println(city.getName());

        System.out.println(processors);
    }
}

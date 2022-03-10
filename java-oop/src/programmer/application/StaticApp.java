package programmer.application;

import programmer.data.Application;
import static programmer.data.Constant.*; // static import
import programmer.data.Country;
import programmer.utils.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,4,5)
        );

        Country.City city = new Country.City();
        city.setName("Pemalang");
        System.out.println(city.getName());

        System.out.println(Application.PROCCESSORS);
    }
}

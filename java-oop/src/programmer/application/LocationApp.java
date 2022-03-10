package programmer.application;

import programmer.data.City;
import programmer.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // error

        var city = new City();
        city.name = "jakarta";

        System.out.println(city.name);
    }
}

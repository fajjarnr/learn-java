package programmer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Fajar");
        names.add("Fahrur");
        names.add("Budi");
        names.set(0, "Andi");
        names.remove(1);
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        for (var name : names){
            System.out.println(name);
        }

        List<String> cities = new LinkedList<>();
        cities.add("Pemalang");
        cities.add("Pekalongan");
        cities.add("Semarang");
    }
}

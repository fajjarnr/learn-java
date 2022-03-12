package programmer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        // Set<String> names = new HashSet<>(); // tidak berurut
        Set<String> names = new LinkedHashSet<>(); // berurut
        names.add("Fajar");
        names.add("Fajar");
        names.add("Nur");
        names.add("Rohman");

        for (var name : names) {
            System.out.println(name);
        }
    }
}

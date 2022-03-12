package programmer;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Fajar", "Nur", "Rohman", "Pemalang", "Jawa", "Tengah"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> rohman = names.tailSet("Rohman", true);

        for (var name : rohman) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Ups");
    }
}

package programmer;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Eko");

        Set<String> mutable = new HashSet<>();
        mutable.add("Fajar");
        mutable.add("Nur");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Fajar", "Nur");

        // set.add("Eko"); error
        // set.remove("Eko"); error

    }
}

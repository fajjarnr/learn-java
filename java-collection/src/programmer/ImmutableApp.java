package programmer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Fajar");
        mutable.add("Nur");
        List<String> immutable = Collections.unmodifiableList(mutable);
        System.out.println(immutable);

        List<String> elements = List.of("Fajar", "Nur", "Rohman");
        // elements.add("Fahrur"); // ERROR tidak dapat diubah
    }
}

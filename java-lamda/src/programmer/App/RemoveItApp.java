package programmer.App;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveItApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Fajar", "Nur", "Rohman"));

        // anonymous class
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });

        // lambda
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);
    }
}

package programmer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Fajar");
        collection.add("Fahrur");
        collection.addAll(List.of("Fajar", "Fahrur", "Budi"));

        collection.remove("Fajar");
        collection.removeAll(List.of("Fahrur", "Budi"));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Fajar")
        );
        System.out.println(
                collection.containsAll(List.of("Fahrur", "Budi"))
        );
    }
}

package programmer.App;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("firstName", "Fajar");
        map.put("middleName", "Nur");
        map.put("lastName", "Rohman");

        // for loop
        for(var name : map.entrySet()){
            System.out.println(name.getKey() + " : " + name.getValue());
        }

        // anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : "+ value);
            }
        });

        // lambda
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

package programmer.App;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Fajar", "Nur", "Rohman");

        // for loop
        System.out.println("For Loop");
        for(var value : list){
            System.out.println(value);
        }

        // forEach anonymous class
        System.out.println("ForEach Anonymous Class");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // lambda
        System.out.println("Lamda");
        list.forEach(value -> System.out.println(value));

        // lambda method reference
        System.out.println("Lambda Method Reference");
        list.forEach(System.out::println);
    }
}

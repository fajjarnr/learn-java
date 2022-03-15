package programmer.App;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("fajar");
        sayHello(null);
    }

    public static void sayHello(String name){
//        Optional<String> optionalName = Optional.ofNullable(name);
//
//        // Optional<String> upperName = optionalName.map(value -> value.toUpperCase());
//        Optional<String> upperName = optionalName.map(String::toUpperCase);
//
//        upperName.ifPresent(value -> System.out.println("Hello " + value));

//        if(name != null){
//            String upperName = name.toUpperCase();
//            System.out.println("Hello " + upperName);
//        }

        // chain method
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("Hello, " + value),
//                        () -> System.out.println("Hello")
//                );

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("Teman");

        System.out.println("Hello " + upperName);

    }
}

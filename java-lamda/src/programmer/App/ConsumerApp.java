package programmer.App;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;

        consumer.accept("Fajar");
    }
}

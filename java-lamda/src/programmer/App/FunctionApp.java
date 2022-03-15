package programmer.App;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;

        System.out.println(function.apply("Fajar"));
    }
}

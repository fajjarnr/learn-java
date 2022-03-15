package programmer.App;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = String::isBlank;

        System.out.println(predicate.test(""));
        System.out.println(predicate.test("Fajar"));
    }
}

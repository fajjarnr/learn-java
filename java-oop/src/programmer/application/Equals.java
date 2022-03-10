package programmer.application;

public class Equals {
    public static void main(String[] args) {
        String first = "Fajar";
        first = first + " " + "Nur";

        System.out.println(first);

        String second = "Fajar Nur";
        System.out.println(second);

        System.out.println(first == second); // false
        System.out.println(first.equals(second)); // true
    }
}

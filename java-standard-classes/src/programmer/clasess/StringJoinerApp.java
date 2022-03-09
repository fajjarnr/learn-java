package programmer.clasess;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        /**
         * String Joiner
         * untuk menggabungkan string dengan delimiter
         */
        StringJoiner joiner = new StringJoiner(",", "[","]");

        joiner.add("Fajar");
        joiner.add("Nur");
        joiner.add("Rohman");

        String name = joiner.toString();
        System.out.println(name);
    }
}

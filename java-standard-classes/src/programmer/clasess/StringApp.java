package programmer.clasess;

import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {
        String name = "Fajar Nur Rohman";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Fajar"));
        System.out.println(name.endsWith("Rohman"));

        String[] names = name.split(" ");
        for (var value : names){
            System.out.println(value);
        }

        System.out.println(name.isBlank());

        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();
        for (var value : chars){
            System.out.println(value);
        }
    }
}

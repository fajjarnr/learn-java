package programmer.generic.application;

import programmer.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] name = {"Fajar", "Fahrur", "Budi"};
        Integer[] age = {22, 13, 20};

        System.out.println(
                ArrayHelper.<String>count(name)
        );

        System.out.println(
                ArrayHelper.count(age)
        );
    }
}

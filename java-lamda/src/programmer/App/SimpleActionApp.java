package programmer.App;

import programmer.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
//        SimpleAction simpleAction = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Fajar";
//            }
//        };
//
//        System.out.println(simpleAction.action("Fajar"));
//
//        SimpleAction simpleAction1 = (String name) -> {
//            return "Fajar";
//        };
//
//        System.out.println(simpleAction1.action("Fajar"));

        SimpleAction simpleAction = (String name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction1 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction2 = (String value) -> "hello " + value;
        SimpleAction simpleAction3 = (value) -> "hello " + value;
        SimpleAction simpleAction4 = value -> "hello " + value;

        System.out.println(simpleAction4.action("Fajar"));
    }
}

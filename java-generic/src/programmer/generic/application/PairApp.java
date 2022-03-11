package programmer.generic.application;

import programmer.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Fajar", 22);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}

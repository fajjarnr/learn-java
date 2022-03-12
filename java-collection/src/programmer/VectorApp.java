package programmer;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();

        list.add("Fajar");
        list.add("Nur");
        list.add("Rohman");

        for (var value : list){
            System.out.println(value);
        }
    }
}

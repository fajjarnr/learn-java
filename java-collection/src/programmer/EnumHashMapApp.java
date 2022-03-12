package programmer;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Fajar");
        map.put(Level.VIP, "Budi");


        for (var key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}

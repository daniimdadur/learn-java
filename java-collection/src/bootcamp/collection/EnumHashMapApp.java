package bootcamp.collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> map = new EnumMap<Level, String>(Level.class);

        map.put(Level.FREE, "Dani");
        map.put(Level.VIP, "Imdadur");
        map.put(Level.PREMIUM, "Rohman");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}

package bootcamp.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("First", "Dani");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("Middle", "Imdadur");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "First","Dani",
                "Middle","Imdadur",
                "Last","Rohman"
        );
        //map.put("Add","Budy");
    }
}

package programmer.zaman.now.application;

import java.util.HashMap;
import java.util.Map;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first_name", "Sony");
        map.put("middle_name", "Middle");
        map.put("last_name", "Darmawan");

        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}

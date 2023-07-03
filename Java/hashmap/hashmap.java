package Java.hashmap;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("England1", "London1");
        capitalCities.put("England2", "London2");
        capitalCities.put("England3", "London3");
        System.out.println("Size of hashmap   :  " + capitalCities.size());
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities);
        capitalCities.remove("England");
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        // capitalCities.clear();

        System.out.println(capitalCities.containsKey("England1"));
        for (Map.Entry<String, String> e : capitalCities.entrySet()) {
            System.out.println(e.getKey() + "  " + e.getValue());
        }

    }
}

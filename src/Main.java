import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Elma");
        list.add("Armut");
        list.add("Elma");
        for (String meyve : list) {
            System.out.println("List Element: " + meyve);
        }

        //Set Example
        Set<String> set = new HashSet<>();
        set.add("Elma");
        set.add("Armut");
        set.add("Elma");
        for (String meyve : set) {
            System.out.println("Set element: " + meyve);
        }

        // Map example
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Elma");
        map.put(2, "Armut");
        map.put(3, "Kiraz");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " - Value: " + map.get(key));

        }

    }
}
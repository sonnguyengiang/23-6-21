package javacollction;
import java.util.HashMap;
import java.util.*;
public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("chung", 26);
        map.put("son",19);
        map.put("hoang",24);
        map.put("duc",24);
        System.out.println("Display entries in HashMap");
        System.out.println(map + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("chung", 26);
        linkedHashMap.put("son",19);
        linkedHashMap.put("hoang",24);
        linkedHashMap.put("duc",24);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("chung"));

    }
}

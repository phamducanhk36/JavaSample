package sample.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapSample {
    public static void main(String[] s){

        /* -------------HashMap------------- */
        HashMap<Object, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        System.out.println("hashMap " + hashMap);
        hashMap.compute("key3", (k, v) -> v + " etc");
        System.out.println("hashMap compute " + hashMap);
        hashMap.computeIfAbsent("key4", v -> v + " etc2");
        hashMap.computeIfAbsent("key2", v -> v + " etc2");
        System.out.println("hashMap computeIfAbsent " + hashMap);
        hashMap.computeIfPresent("key5", (k, v) -> v + " etc3");
        hashMap.computeIfPresent("key2", (k, v) -> v + " etc3");
        System.out.println("hashMap computeIfPresent " + hashMap);
        /* -------------LinkedHashMap------------- */
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("key1", "value1");
        linkedHashMap.put("key2", "value2");
        System.out.println("linkedHashMap " + linkedHashMap);
        linkedHashMap.compute("key3", (k, v) -> v + " etc");
        System.out.println("linkedHashMap compute " + linkedHashMap);
        linkedHashMap.computeIfAbsent("key4", v -> v + " etc2");
        linkedHashMap.computeIfAbsent("key2", v -> v + " etc2");
        System.out.println("linkedHashMap computeIfAbsent " + linkedHashMap);
        linkedHashMap.computeIfPresent("key5", (k, v) -> v + " etc3");
        linkedHashMap.computeIfPresent("key2", (k, v) -> v + " etc3");
        System.out.println("hashMap computeIfPresent " + linkedHashMap);
    }
}

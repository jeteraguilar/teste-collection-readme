package br.com.demo.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void demonstrarMapas() {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(1, "Elemento1");
        hashMap.put(2, "Elemento2");
        System.out.println("HashMap: " + hashMap);

        linkedHashMap.put(1, "Elemento1");
        linkedHashMap.put(2, "Elemento2");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        treeMap.put(1, "Elemento1");
        treeMap.put(2, "Elemento2");
        System.out.println("TreeMap: " + treeMap);
    }
}

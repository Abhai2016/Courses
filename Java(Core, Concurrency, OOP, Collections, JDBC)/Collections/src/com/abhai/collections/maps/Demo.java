package com.abhai.collections.maps;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map map1 = new HashMap<String, Integer>();
        map1.put("1", 1);
        map1.put("3", 3);
        map1.put("2", 2);
        System.out.println("HashMap");
        printCollection(map1); // ascending order by hashCode

        Map map2 = new Hashtable<String, Integer>();
        map2.put("1", 1);
        map2.put("3", 3);
        map2.put("2", 2);
        System.out.println("Hashtable");
        printCollection(map2); // synchronized version of HashMap

        Map map3 = new LinkedHashMap<String, Integer>();
        map3.put("1", 1);
        map3.put("3", 3);
        map3.put("2", 2);
        System.out.println("LinkedHashMap");
        printCollection(map3); // guarantees order in which we added elements

        Map map4 = new TreeMap<String, Integer>();
        map4.put("1", 1);
        map4.put("3", 3);
        map4.put("2", 2);
        System.out.println("TreeMap");
        printCollection(map4); // ordered map so there is ascending order by value
    }



    private static void printCollection(Map map) {
        for (Object key : map.keySet()) {
            Object value = map.get(key);
            System.out.println(key + " : " + value);
        }
        System.out.println();
    }
}

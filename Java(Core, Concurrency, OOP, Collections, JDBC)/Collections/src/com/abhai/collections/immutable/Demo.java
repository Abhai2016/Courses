package com.abhai.collections.immutable;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("lol1");
        list.add("lol2");
        List<String> immutableList = Collections.unmodifiableList(list);

        Set<String> set = new HashSet<>();
        set.add("lol1");
        set.add("lol2");
        Set<String> immutableSet = Collections.unmodifiableSet(set);

        Map<String, Integer> map = new HashMap<>();
        map.put("lol1", 1);
        map.put("lol2", 2);
        Map<String, Integer> immutablemap = Collections.unmodifiableMap(map);

//         There is no immutableQueue however -.-
    }
}

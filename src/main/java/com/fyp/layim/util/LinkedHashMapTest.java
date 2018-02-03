package com.fyp.layim.util;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap map = new LinkedHashMap();
        map.put("name", "zhaobicheng");
        map.put("age", 20);
        map.put("cont", 2000l);

        map.forEach((key,value)-> System.out.println(key + "-->" + value));

    }
}

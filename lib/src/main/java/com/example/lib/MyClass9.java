package com.example.lib;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyClass9 {
    public static void main(String[] args) {
        Map myMap = new LinkedHashMap();
        myMap.put("name", "ansari");
        myMap.put("id", 101);
        myMap.put("password", "mypass");

        Set mySet = myMap.entrySet();


        Iterator itr = mySet.iterator();
        while(itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("keys are " + entry.getKey() + " values are " + entry.getValue());
        }
    }
}

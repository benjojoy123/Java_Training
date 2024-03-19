package com.example.lib;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Myclass11 {
    public static void main(String[] args) {
        Map map1 = new LinkedHashMap();

        Scanner obj1 = new Scanner(System.in);

        while (true) {
            System.out.println("enter key");
            String s1 = obj1.nextLine();
            System.out.println("enter value");
            String s2 = obj1.nextLine();
            if (map1.containsValue(s2)) {
                System.out.println("same value is presenr" + map1.get(s1));
                break;
            } else {
                map1.put(s1, s2);
            }
        }
        Set myset = map1.entrySet();
        Iterator itr = myset.iterator();
        while (itr.hasNext()) {
            Map.Entry enty = (Map.Entry)itr.next();
            System.out.println("key is : " + enty.getKey() + " value is :" + enty.getValue());
        }

    }
}
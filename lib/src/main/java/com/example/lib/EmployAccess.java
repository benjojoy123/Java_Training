package com.example.lib;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;





    public class EmployAccess {
        public static void main(String[] args) {
            Map mymap = new LinkedHashMap();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter the key (ID) or 'exit' to quit:");
                String key = scanner.nextLine();
                System.out.println("Enter the value:");
                String value = scanner.nextLine();
                if (key.equals("exit")) {
                    break;
                }

                if (mymap.containsValue(value)) {
                    System.out.println("ID already exists! Existing value: " + mymap.get(key));
                    break;
                } else {
                    // System.out.println("Enter the value:");
                    //
                    // String value = scanner.nextLine();
                    mymap.put(key, value);
                }
            }

            Set mySet = mymap.entrySet();
            Iterator itr = mySet.iterator();
            while(itr.hasNext()) {
                Map.Entry entry = (Map.Entry) itr.next();
                System.out.println("keys are " + entry.getKey() + " values are " + entry.getValue());
            }
        }
    }



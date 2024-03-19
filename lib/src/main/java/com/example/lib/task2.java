package com.example.lib;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class task2 {
    ArrayList<String> names;
       task2() {
           names = new ArrayList<>();


       }

    /**
     * input of strings happening
     *
     **/
    void reading(){
               String ch = "exit";
               Scanner task = new Scanner(System.in);
               while (true) {
                   String v1 = task.nextLine();
                   if (v1.equals(ch))
                       break;
                   else
                       names.add(v1);


               }


       }
}

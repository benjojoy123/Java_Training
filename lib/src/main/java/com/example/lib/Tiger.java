package com.example.lib;
/**
 * this is Tiger class with one default constructor and one parametrized
 *
 **/
public class Tiger {
    static String name="babu";
    int legs=0;
    Tiger(){
        System.out.println("this is my constructor");
    }
    Tiger(String city,int legs)
    {
        System.out.println("tiger is from "+city);
        this.legs=legs;
        System.out.println("and legs"+legs);
    }

}

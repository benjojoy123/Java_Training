package com.example.lib;

import java.util.ArrayList;

import java.util.ArrayList;

interface Myinterface
{
    void abstractfunction(int a);
}
public class MyClass5 {
    public static void main(String[] args)
    {
        Myinterface myinterface= (x) -> System.out.println(x * x);
        myinterface.abstractfunction(2);


        ArrayList<Integer>myarr=new ArrayList<Integer>();
        myarr.add(2);
        myarr.add(5);
        myarr.add(6);
        myarr.add(8);

        System.out.println("array is "+myarr);

        myarr.forEach(item-> System.out.println("ghsd"+myarr));

        myarr.forEach(item->{
            if(item%2==0) {
                System.out.println(item);
            }
        });


    }

}
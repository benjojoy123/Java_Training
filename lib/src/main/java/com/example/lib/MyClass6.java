package com.example.lib;
class Demo {


    interface MyFunInterface

    {

        int addNumber ( int a, int b);
    }

    public int Operate(int x, int y, MyFunInterface myfun) {


        return myfun.addNumber(x, y);
    }
}

public class MyClass6 {

   public static void main(String[] args){
Demo.MyFunInterface myadd=(int a,int b)->a+b;
Demo.MyFunInterface mymul=(int a ,int b)->a*b;
Demo demo=new Demo();

var res= demo.Operate(2,4,myadd);
var res2=demo.Operate(4,6,mymul);
System.out.println(res);
System.out.println(res2);

   }



}

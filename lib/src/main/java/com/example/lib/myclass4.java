package com.example.lib;

public class myclass4 {


    void f1() {
        System.out.println("in f1");
        int a = 10;
        int b = 0;
        int res = a / b;
    }

    void f2() {

        System.out.println("in f2");
        f1();

        System.out.println("function 2");
    }

    void result() {
        try {
            int a=10;
            int b=0;
            //f2();
            try {
                int result = a / b;
            }catch (Exception e){
                System.out.println("eccccc :"+e);
            }
            f2();
        } catch (Exception e) {
            System.out.println("exception :" + e);
        }
    }
    public static void main(String[] args){
        myclass4 m1 =new myclass4();
        m1.result();

    }
}







package com.example.lib;

public class myclass3 {
    public static void main(String[] args) {


            int a = 10;
            int b = 0;

            try {
                int res = a / b;
            }catch (Exception e) {

                System.out.println("exception :" + e);

            }
            try{
                int[] myArray =new int[5];
                System.out.println(myArray[10]);
            }catch (IndexOutOfBoundsException e) {

            System.out.println("Array :" + e);
            }
        catch (ArithmeticException e) {

            System.out.println("exception :" + e);

        }
    }

}

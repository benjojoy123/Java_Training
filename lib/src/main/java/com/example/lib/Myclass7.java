package com.example.lib;

import java.util.ArrayList;
class Ele {
    int biggest(int[] a) {
        int big = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > big) {
                big = a[i];
            }
        }
        return big;
    }
     void sorting(int[] a){
        int temp=0;
        for(int i=0;i<a.length;i++) {
           for(int j=i+1;j<a.length;j++){
                    if(a[i]>a[j])
                    {
                      temp=a[i];
                      a[i]=a[j];
                      a[j]=temp;
                    }
           }
        }
    }
}

public class Myclass7 {

    public static void main(String[] args){

       // ArrayList<Integer> myArray=new ArrayList<Integer>();

        int myArray[]={5,4,3,2,1};
        Ele m1=new Ele();
        int Big=m1.biggest(myArray);
        System.out.println(Big);
        m1.sorting(myArray);

        for(int i=0;i<myArray.length;i++)
       System.out.println(myArray[i]);
    }


}

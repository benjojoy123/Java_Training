package com.example.lib;

import java.util.Scanner;
class Solution {
    public String MergeStrings(String word1, String word2) {
        StringBuilder b1 = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            b1.append(word1.charAt(i++));
            b1.append(word2.charAt(j++));
        }
        while (i < word1.length())
            b1.append(word1.charAt(i++));
        while (j < word2.length())
            b1.append(word2.charAt(i++));
        return b1.toString();

    }
}
public class Myclass12 {

    public  static void main(String[] args){
        Solution s1=new Solution();
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter");
        String word1=obj1.nextLine();
        String word2=obj1.nextLine();
       String merged =s1.MergeStrings(word1,word2);
       System.out.println("Merged string : "+merged);


    }
}

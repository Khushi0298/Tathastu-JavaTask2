package com.Tathastujava;

import java.util.*;

public class reverseString {
    public static void main(String args[]){
        //Write a Java Program to reverse the letters present in the given String.
        Scanner sc=new Scanner(System.in);
        String nstr="";
        char ch;
        String str=sc.next();
        System.out.println("Original string:"+ str);
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("Reverse String is: "+nstr);

    }
}

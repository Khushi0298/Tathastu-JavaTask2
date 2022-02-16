package com.Tathastujava;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        //Write a Java program to calculate Fibonacci Series up to n numbers.
        int n1=0,n2=1,n3,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(n1+" "+n2);

        for(i=0;i<n;i++){
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}

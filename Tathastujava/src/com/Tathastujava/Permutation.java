package com.Tathastujava;

import java.util.*;

public class Permutation {
    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        //Write a Java program to calculate Permutation and Combination of 2 numbers
        int n,r,Pres=0,Cres=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        n=sc.nextInt();
        System.out.println("Enter second number: ");
        r= sc.nextInt();
        Pres=fact(n)/fact(n-r);
        System.out.println("Permutation(nPr) is "+ Pres);
        Cres=fact(n)/(fact(n-r)*fact(r));
        System.out.println("Combination(nCr) is "+ Cres);
    }
}

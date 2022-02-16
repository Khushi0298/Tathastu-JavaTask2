package com.Tathastujava;
import java.util.*;

public class Factorial {
    public static void main(String[] args){
        //Write a Java program to calculate a Factorial of a number.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=sc.nextInt();
        int res=1;
        for(int i=1;i<=num;i++){
            res=res*i;
        }
        System.out.println("Factorial of"+ num+" is: "+res);
    }
}

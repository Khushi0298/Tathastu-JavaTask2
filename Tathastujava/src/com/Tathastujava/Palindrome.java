package com.Tathastujava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        //Write a Java program to find out whether the given String is Palindrome or not.
        int num,rem=0,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        num=sc.nextInt();
        int N=num;
        while(num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if(N==rev){
            System.out.println(N+" is Palindrome Number.");
        }
        else{
            System.out.println(N+" is not Palindrome Number.");
        }
    }
}

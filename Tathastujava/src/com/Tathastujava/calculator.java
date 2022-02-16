package com.Tathastujava;
import java.util.*;

public class calculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose Operation which you want to apply:(+, -, * , /, % ");
        char choice=sc.next().charAt(0);
        System.out.println("Enter First Number: ");
        double Num1= sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double Num2= sc.nextDouble();

        double result;

        switch (choice){
            case '+':
                result= Num1+Num2;
                System.out.println(Num1 + "+" + Num2+" = "+result);
                break;
            case '-':
                result = Num1-Num2;
                System.out.println(Num1 + "-" + Num2+" = "+result);
                break;
            case '*':
                result=Num1*Num2;
                System.out.println(Num1 + "*" + Num2+" = "+result);
                break;
            case '/':
                result =Num1/Num2;
                System.out.println(Num1 + "+" + Num2+" = "+result);
                break;
            case '%':
                result=Num1%Num2;
                System.out.println(Num1 + "+" + Num2+" = "+result);
                break;
            default:
                System.out.println("Please Enter Valid Operation!");
        }
    }
}

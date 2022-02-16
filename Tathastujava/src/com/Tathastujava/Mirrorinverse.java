package com.Tathastujava;

public class Mirrorinverse {
    public static void main(String args[]){
        //Write a Java Program to check whether the given array is Mirror Inverse or not.
        int count=0;
        int[] arr={3,4,5,0,1,2};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[arr[i]]==i){
                count++;
            }
        }
        if(count!=0){
            System.out.println("Given array is Mirror Inverse.");
        }
        else{
            System.out.println("Given array is not Mirror Inverse.");
        }
    }
}

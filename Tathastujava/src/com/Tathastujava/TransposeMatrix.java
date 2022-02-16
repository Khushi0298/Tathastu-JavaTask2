package com.Tathastujava;

public class TransposeMatrix {
    public static void main(String args[]){
        //Write a Java Program to find the Transpose of a given Matrix.
        int original[][]={{1,4,7},{2,5,8},{3,6,9}};

//creating another matrix to store transpose of a matrix
        int transpose[][]=new int[3][3];  //3 rows and 3 columns

//Code to transpose a matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j]=original[j][i];
            }
        }

        System.out.println(" Matrix without transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" Matrix After Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }}

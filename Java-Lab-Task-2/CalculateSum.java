//1. Take two integer numbers as input and calculate their sum.

package com.mycompany.ooplabtask2;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        int a,b;
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two Interger Number:");
        a=input.nextInt();
        b=input.nextInt();
      
        sum=a+b;
        
        System.out.println("The sum of two Integer:"+sum);
    }
    }


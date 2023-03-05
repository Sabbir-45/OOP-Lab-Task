//2. Calculate the area of a circle. Take radius as input.?
package com.mycompany.ooplabtask2;

import java.util.Scanner;

public class AreaOfaCircle {
    public static void main(String[] args) {
        double r,area;
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the Radius:");
        r=input.nextDouble();
        
        area=3.1416*r*r;
        
        System.out.println("Area of Circle:"+area);
    }
}

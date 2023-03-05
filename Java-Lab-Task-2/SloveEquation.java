//4. Read four integer values named A, B, C and D. Solve the following equation and print the result.
//a) (A * B - C * D)
//b) 2A – B + 3D 
//c)A2+ B2-C2+D2(Square)
//d) A3 + B –C2 (Square)

package com.mycompany.ooplabtask2;

import java.util.Scanner;

public class SloveEquation {
    public static void main(String[] args) {
        int A,B,C,D;
 
       Scanner input=new Scanner(System.in);
       A=input.nextInt();
       B=input.nextInt();
       C=input.nextInt();
       D=input.nextInt();
              
        int Equation1= (A * B - C * D);
        int Equation2= (2*A - B + 3*D);
        int Equation3= (A*A + B*B - C*C + D*D);
        int Equation4= (A*A*A + B - C*C);
        
        System.out.println("Solution of Equation - 1:" +Equation1);
        System.out.println("Solution of Equation - 2:" +Equation2);
        System.out.println("Solution of Equation - 3:" +Equation3);
        System.out.println("Solution of Equation - 4:" +Equation4);
      
       
       
      
    }
}
